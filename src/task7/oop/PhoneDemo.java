package task7.oop;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone("111-111", "iPhone", 0.3);
        Phone phone2 = new Phone("222-222", "Samsung", 0.25);
        Phone phone3 = new Phone("333-333", "Xiaomi", 0.28);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Алина");
        phone2.receiveCall("Иван", "999-999");
        phone3.receiveCall("Мария");

        System.out.println("Номер phone1: " + phone1.getNumber());
        System.out.println("Номер phone2: " + phone2.getNumber());
        System.out.println("Номер phone3: " + phone3.getNumber());

        Phone.sendMessage("111-111", "222-222", "333-333", "444-444");
    }
}