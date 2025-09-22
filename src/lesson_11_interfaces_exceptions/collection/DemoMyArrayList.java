package lesson_11_interfaces_exceptions.collection;

public class DemoMyArrayList {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("one");
        list.add("two");
        list.add("three");
        System.out.println(list); // [one, two, three]

        System.out.println("Элемент по индексу 1: " + list.get(1)); // two
        System.out.println("Содержит 'two'? " + list.contains("two")); // true

        list.remove("two");
        System.out.println(list); // [one, three]

        list.clear();
        System.out.println("После clear: " + list); // []
    }
}