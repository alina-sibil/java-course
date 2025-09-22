package lesson_10_interfaces_exceptions.docs;

public class DemoDocNumber {
    public static void main(String[] args) {
        String doc = "1234-ABC-5678-def-a1b2";

        System.out.println(DocNumberUtils.firstTwoDigitBlocks(doc));
        System.out.println(DocNumberUtils.maskLetterBlocks(doc));
        System.out.println(DocNumberUtils.lettersLower(doc));
        System.out.println(DocNumberUtils.lettersUpperWithLabel(doc));
        System.out.println("Contains abc? " + DocNumberUtils.containsAbc(doc));
        System.out.println("Starts with 555? " + DocNumberUtils.startsWith555(doc));
        System.out.println("Ends with 1a2b? " + DocNumberUtils.endsWith1a2b(doc));
    }
}