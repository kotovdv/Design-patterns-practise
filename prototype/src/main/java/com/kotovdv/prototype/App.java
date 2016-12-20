package com.kotovdv.prototype;

import com.kotovdv.prototype.shape.factory.ShapesTemplatesFactory;
import com.kotovdv.prototype.shape.impl.Circle;
import com.kotovdv.prototype.shape.impl.Rectangle;
import com.kotovdv.prototype.shape.impl.Square;

import static com.kotovdv.prototype.shape.color.ShapeColor.WHITE;

/**
 * @author Dmitriy Kotov
 */
public class App {

    public static void main(String[] args) {
        ShapesTemplatesFactory templateFactory = createTemplateFactory();
        ShapeEditorClient client = new ShapeEditorClient(templateFactory);

        client.doSomething();
    }

    private static ShapesTemplatesFactory createTemplateFactory() {
        Square square = new Square(1.0d, WHITE);
        Rectangle rectangle = new Rectangle(1.0d, 1.0d, WHITE);
        Circle circle = new Circle(1.0d, WHITE);

        return new ShapesTemplatesFactory(square, rectangle, circle);
    }
}
