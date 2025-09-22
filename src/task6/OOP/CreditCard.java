package task6.OOP;

public class CreditCard {
    private String accountNumber;
    private double balance;

    public CreditCard(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Сумма должна быть положительной.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Недостаточно средств или сумма некорректна.");
        }
    }

    public void printInfo() {
        System.out.println("Карта: " + accountNumber + ", Баланс: " + balance);
    }
}