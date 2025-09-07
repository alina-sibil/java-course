package task6.OOP;

/*
Создать класс CreditCard с полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
*/
class CreditCard {
    public String accountNumber;
    public double balance;

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public void printInfo() {
        System.out.println("Account number: " + accountNumber + ", Balance: " + balance);
    }
}

public class CreditCardTest {
    public static void main(String[] args) {
        // Создаём три карточки
        CreditCard card1 = new CreditCard();
        card1.accountNumber = "1234";
        card1.balance = 1000;

        CreditCard card2 = new CreditCard();
        card2.accountNumber = "5678";
        card2.balance = 500;

        CreditCard card3 = new CreditCard();
        card3.accountNumber = "9012";
        card3.balance = 200;

        // Тестовый сценарий
        card1.deposit(250);   // положили деньги на первую
        card2.deposit(400);   // положили деньги на вторую
        card3.withdraw(150);  // сняли деньги с третьей

        // Выводим текущее состояние
        System.out.println("-".repeat(40));
        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}