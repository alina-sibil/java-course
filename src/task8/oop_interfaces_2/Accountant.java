package task8.oop_interfaces_2;

public class Accountant implements JobTitle {
    @Override
    public void printJobTitle() {
        System.out.println("Должность: Бухгалтер");
    }
}