package task8.oop_interfaces;

/*
Написать иерархию классов «Фигуры».
Фигура -> Треугольник -> Прямоугольник -> Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет периметра.
Создать массив из 5 фигур.
Вывести на экран сумму периметра всех фигур в массиве.
*/

public class MyFigures {
    public static void main(String[] args) {
        Figure[] figures = new Figure[]{
                new Triangle(3, 4, 5),
                new Rectangle(4, 6),
                new Circle(5),
                new Triangle(6, 7, 8),
                new Circle(10)
        };

        double totalPerimeter = 0;
        for (Figure figure : figures) {
            System.out.println(figure);
            totalPerimeter += figure.getPerimeter();
        }

        System.out.println("-".repeat(50));
        System.out.println("Total perimeter of all figures = " + totalPerimeter);
    }
}

abstract class Figure {
    abstract double getArea();
    abstract double getPerimeter();
}

class Triangle extends Figure {
    private final double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return "Triangle: sides = " + a + ", " + b + ", " + c +
                " | Area = " + getArea() +
                " | Perimeter = " + getPerimeter();
    }
}

class Rectangle extends Figure {
    private final double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle: width = " + width + ", height = " + height +
                " | Area = " + getArea() +
                " | Perimeter = " + getPerimeter();
    }
}

class Circle extends Figure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: radius = " + radius +
                " | Area = " + getArea() +
                " | Perimeter = " + getPerimeter();
    }
}
