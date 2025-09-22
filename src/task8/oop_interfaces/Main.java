package task8.oop_interfaces;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(3, 4, 5);
        figures[1] = new Rectangle(4, 6);
        figures[2] = new Circle(3);
        figures[3] = new Rectangle(2, 8);
        figures[4] = new Triangle(6, 6, 6);

        double totalPerimeter = 0;
        for (Figure f : figures) {
            totalPerimeter += f.getPerimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
    }
}
