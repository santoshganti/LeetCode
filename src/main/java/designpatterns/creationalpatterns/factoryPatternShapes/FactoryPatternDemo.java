package designpatterns.creationalpatterns.factoryPatternShapes;

import designpatterns.creationalpatterns.factoryPatternShapes.shapefactory.ShapeFactory;
import designpatterns.creationalpatterns.factoryPatternShapes.shapes.Shape;
import designpatterns.creationalpatterns.factoryPatternShapes.shapes.ShapeType;

/**
 * Creates an object hence a creational design pattern
 *
 * Create objects without exposing the creation logic and refer to newly created objects
 * using common interface.
 *
 *
 */

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape(ShapeType.CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeType.RECTANGLE);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(ShapeType.SQUARE);
        shape3.draw();
    }
}