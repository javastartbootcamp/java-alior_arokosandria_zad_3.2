package pl.javastart.task;

public class ShapeCalculator {
    protected double calculateSquareArea(Square square) {
        return square.a * square.a;
    }

    protected double calculateCircleArea(Circle circle) {
        return Math.PI * circle.r * circle.r;
    }

    protected double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.a + triangle.b + triangle.c;
    }

    protected double calculateRectPerimeter(Rectangle rectangle) {
        return 2 * rectangle.a + 2 * rectangle.b;
    }
}
