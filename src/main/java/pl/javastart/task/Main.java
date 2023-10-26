package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(2.4);
        System.out.println("Pole koła wynosi: " + circle.circleArea());
        Rectangle rectangle = new Rectangle(3, 2);
        System.out.println("Obwód prostokąta wynosi: " + rectangle.rectPerimeter());
        Square square = new Square(10);
        System.out.println("Pole kwadratu wynosi: " + square.squareArea());
        Triangle triangle = new Triangle(2, 3, 4, 10);
        System.out.println("Obwód trójkąta wynosi: " + triangle.trianglePerimeter());

    }
}
