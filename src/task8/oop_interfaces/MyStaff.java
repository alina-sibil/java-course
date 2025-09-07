package task8.oop_interfaces;


/*
Создать классы "Директор", "Рабочий", "Бухгалтер".
Реализовать интерфейс с методом, который печатает название должности
и имплементировать этот метод в созданные классы.
*/

public class MyStaff {
    public static void main(String[] args) {
        JobTitle[] staff = new JobTitle[]{
                new Director(),
                new Worker(),
                new Accountant()
        };

        for (JobTitle member : staff) {
            member.printPosition();
        }
    }
}

interface JobTitle {
    void printPosition();
}

class Director implements JobTitle {
    @Override
    public void printPosition() {
        System.out.println("Position: Director");
    }
}

class Worker implements JobTitle {
    @Override
    public void printPosition() {
        System.out.println("Position: Worker");
    }
}

class Accountant implements JobTitle {
    @Override
    public void printPosition() {
        System.out.println("Position: Accountant");
    }
}