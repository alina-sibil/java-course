package task8.oop_interfaces;

public class Triangle extends Figure {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c)); // формула Герона
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
