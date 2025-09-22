package lesson_12_ip_validator;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IpValidator {
    // Регулярка для IPv4: 0–255 в каждом октете
    private static final String IP_REGEX =
            "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}"
                    + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

    private static final Pattern IP_PATTERN = Pattern.compile(IP_REGEX);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите IP-адрес: ");
        String input = scanner.nextLine();

        if (IP_PATTERN.matcher(input).matches()) {
            System.out.println("IP-адрес валиден");
        } else {
            System.out.println("IP-адрес НЕвалиден");
        }
    }
}