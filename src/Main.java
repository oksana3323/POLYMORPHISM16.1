import java.awt.*;
import java.awt.geom.CubicCurve2D;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(4, 5);
        Circle circle = new Circle(6, 4);
        Square square = new Square(4, 4);
        triangle.findArea(4, 5);
        circle.findArea(6, 4);
        square.findArea(4, 4);
        System.out.println(triangle.toString());
    }

};
