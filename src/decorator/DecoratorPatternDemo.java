/*
Decorator pattern allows adding new functionality an existing object without altering its
structure. This type of design pattern comes under structural pattern as this pattern acts as a
wrapper to existing class.
This pattern creates a decorator class which wraps the original class and provides additional
functionality keeping class methods signature intact.
We are demonstrating use of Decorator pattern via following example in which we'll decorate a
shape with some color without alter shape class

From DESIGN PATTERNS IN JAVA TUTORIAL - Simply Easy Learning
 */
package decorator;

/**
 *
 * @author willian
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        
        circle.draw();
        rectangle.draw();
        System.out.println("\n");
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
        System.out.println("\n");
        rectangle = new RedShapeDecorator(rectangle);
        rectangle.draw();
        
    }
}
