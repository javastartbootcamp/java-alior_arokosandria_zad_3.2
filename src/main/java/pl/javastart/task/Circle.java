package pl.javastart.task;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double circleArea() {
        return Math.PI * r * r;
    }
}
