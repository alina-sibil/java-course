package lesson_10_interfaces_exceptions.docs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DocNumberUtils {
    private DocNumberUtils() {}

    private static final Pattern P = Pattern.compile(
            "^(\\d{4})-([A-Za-z]{3})-(\\d{4})-([A-Za-z]{3})-([A-Za-z]\\d[A-Za-z]\\d)$"
    );

    private static Matcher m(String s) {
        Matcher m = P.matcher(s);
        if (!m.matches()) throw new IllegalArgumentException("Invalid document format");
        return m;
    }

    public static String firstTwoDigitBlocks(String doc) {
        Matcher m = m(doc);
        return m.group(1) + " " + m.group(3);
    }

    public static String maskLetterBlocks(String doc) {
        Matcher m = m(doc);
        return m.group(1) + "-***-" + m.group(3) + "-***-" + m.group(5);
    }

    public static String lettersLower(String doc) {
        Matcher m = m(doc);
        String y1 = m.group(2).toLowerCase();
        String y2 = m.group(4).toLowerCase();
        String last = m.group(5).toLowerCase();
        return y1 + "/" + y2 + "/" + last.charAt(0) + "/" + last.charAt(2);
    }

    public static String lettersUpperWithLabel(String doc) {
        return "LETTERS:" + lettersLower(doc).toUpperCase();
    }

    public static boolean containsAbc(String doc) {
        return doc.toLowerCase().contains("abc");
    }

    public static boolean startsWith555(String doc) {
        return doc.startsWith("555");
    }

    public static boolean endsWith1a2b(String doc) {
        return doc.toLowerCase().endsWith("1a2b");
    }
}