package task6.OOP;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("1111-2222-3333-4444", 100.0);
        CreditCard card2 = new CreditCard("5555-6666-7777-8888", 200.0);
        CreditCard card3 = new CreditCard("9999-0000-1111-2222", 300.0);

        card1.deposit(50.0);
        card2.deposit(100.0);
        card3.withdraw(150.0);

        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}
