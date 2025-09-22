package task8.oop_interfaces_2;

public class Main {
    public static void main(String[] args) {
        JobTitle director = new Director();
        JobTitle worker = new Worker();
        JobTitle accountant = new Accountant();

        director.printJobTitle();
        worker.printJobTitle();
        accountant.printJobTitle();
    }
}