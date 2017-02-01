package com.kotovdv.command;

import com.kotovdv.command.drawing.DrawBlueCircleCommand;
import com.kotovdv.command.drawing.DrawRedRectangleCommand;
import com.kotovdv.command.drawing.DrawingCommand;
import com.kotovdv.command.figures.Circle;
import com.kotovdv.command.figures.Rectangle;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Dmitriy Kotov
 */
public class UserInputController {

    private static final int DEFAULT_RECTANGLE_SIZE = 20;
    private static final int DEFAULT_CIRCLE_RADIUS = 10;

    private final Deque<DrawingCommand> commandsToExecute = new LinkedList<>();
    private final Deque<DrawingCommand> executedCommands = new LinkedList<>();
    private final GraphicsContext gc;

    public UserInputController(GraphicsContext gc) {
        this.gc = gc;
    }

    public void handleMouseEvents(MouseEvent event) {
        MouseButton button = event.getButton();
        switch (button) {
            case PRIMARY: {
                commandsToExecute.clear();
                drawRectangle(event);
                break;
            }
            case SECONDARY: {
                commandsToExecute.clear();
                drawCircle(event);
                break;
            }
        }
    }

    public void handleKeyboardEvent(KeyEvent event) {
        switch (event.getCode()) {
            case LEFT: {
                rollBackLastCommand();
                break;
            }
            case RIGHT: {
                returnRolledBackCommand();
                break;
            }
        }
    }

    private void returnRolledBackCommand() {
        if (commandsToExecute.isEmpty()) {
            return;
        }

        DrawingCommand drawingCommand = commandsToExecute.pollFirst();
        execute(drawingCommand);
    }

    private void rollBackLastCommand() {
        if (executedCommands.isEmpty()) {
            return;
        }

        DrawingCommand command = executedCommands.pollFirst();
        rollback(command);
    }

    private void drawRectangle(MouseEvent event) {
        Rectangle rectangle = new Rectangle(event.getSceneX(), event.getSceneY(), DEFAULT_RECTANGLE_SIZE, DEFAULT_RECTANGLE_SIZE);

        execute(new DrawRedRectangleCommand(rectangle, gc));
    }

    private void drawCircle(MouseEvent event) {
        Circle rectangle = new Circle(event.getSceneX(), event.getSceneY(), DEFAULT_CIRCLE_RADIUS);

        execute(new DrawBlueCircleCommand(rectangle, gc));
    }

    private void execute(DrawingCommand command) {
        command.draw();
        executedCommands.addFirst(command);
    }

    private void rollback(DrawingCommand command) {
        command.erase();
        commandsToExecute.addFirst(command);
    }
}