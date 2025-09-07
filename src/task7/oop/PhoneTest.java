package task7.oop;

class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {
        this("Unknown", "Unknown", 0.0);
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Incoming call from " + name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Incoming call from " + name + " (" + callerNumber + ")");
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String message, String... numbers) {
        System.out.println("Sending message: \"" + message + "\"");
        for (String n : numbers) {
            System.out.println("To: " + n);
        }
    }

    public void printInfo() {
        System.out.println("Phone info: Number=" + number + ", Model=" + model + ", Weight=" + weight + " kg");
    }
}

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+48 123 456 789", "iPhone", 0.174);
        Phone phone2 = new Phone("+48 987 654 321", "Pixel", 0.197);
        Phone phone3 = new Phone("+48 555 222 111", "Motorola");

        phone1.printInfo();
        phone2.printInfo();
        phone3.printInfo();

        System.out.println("-".repeat(40));

        phone1.receiveCall("Alina");
        System.out.println("Number: " + phone1.getNumber());

        phone2.receiveCall("Alena");
        System.out.println("Number: " + phone2.getNumber());

        phone3.receiveCall("Elena");
        System.out.println("Number: " + phone3.getNumber());

        System.out.println("-".repeat(40));

        phone1.receiveCall("Ellina", "+48 600 700 800");

        phone2.sendMessage("Hi!", "+48 700 111 222", "+48 800 333 444");
        phone3.sendMessage("Call me back", "+48 900 555 666");
    }
}