package task8.oop_interfaces_2;

public class Worker implements JobTitle {
    @Override
    public void printJobTitle() {
        System.out.println("Должность: Рабочий");
    }
}
