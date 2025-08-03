//one line comment

/*
multiple line comment
 */

/**
 * JavaDoc
 */

public class MyMain {
    public static void main(String[] args) {
        //виды принтов
        System.out.print("Hello and welcome!");
        System.out.println("2Hello and welcome!");
        System.out.print("2Hello and welcome!");
        //System.out.println(""); //просто добавляет пустую строку
        System.out.println("   ");
        System.out.print("Message");
        System.out.print("\n"); //escape sequence
        System.out.print("after message");
        System.out.println("+new commit");

        // калькулятор с int
        int a = 7, b = 3;
        int ostatok = a % b;
        System.out.println((a + b) / 2.0);
        System.out.println("Остаток: " + ostatok);

        //пример с boolean
        int age = 17;
        boolean isAdult = true;
        boolean canDrinkAlcohol = isAdult && age >= 18;
        System.out.println("Можно ли пить алкоголь? " + canDrinkAlcohol);

        //просто пробую char
        char letter = 'a';
        char digit = '7';
        char symbol = '#';
        System.out.println("letter=" + letter + ", digit=" + digit + ", symbol=" + symbol);

    }
}