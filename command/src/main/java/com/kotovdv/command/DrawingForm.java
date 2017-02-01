package com.kotovdv.command;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

/**
 * Starts drawing form
 * <p>
 * Use left mouse key to draw red rectangles
 * Use right mouse key to draw blue circles
 * <p>
 * To rollback what was drawn - click LEFT arrow key (not num pad)
 * To forward what was rolled back - click RIGHT arrow key (not num pad)
 *
 * @author Dmitriy Kotov
 */
public class DrawingForm extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(new Group(buildCanvas())));
        primaryStage.setTitle("Drawing Form");
        primaryStage.show();
    }

    private Canvas buildCanvas() {
        Canvas canvas = new Canvas(400, 400);
        canvas.setFocusTraversable(true);

        UserInputController userInputController = new UserInputController(canvas.getGraphicsContext2D());
        canvas.setOnMouseClicked(userInputController::handleMouseEvents);
        canvas.setOnKeyReleased(userInputController::handleKeyboardEvent);

        return canvas;
    }
}