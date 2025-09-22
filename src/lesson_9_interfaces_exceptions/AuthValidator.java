package lesson_9_interfaces_exceptions;

public class AuthValidator {
    public static boolean validate(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login == null || login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Login must be <20 characters and without spaces.");
        }

        if (password == null || password.length() >= 20 || password.contains(" ")) {
            throw new WrongPasswordException("Password must be <20 characters and without spaces.");
        }

        if (!password.matches(".*\\d.*")) {
            throw new WrongPasswordException("Password must contain at least one digit.");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password and confirmPassword do not match.");
        }

        return true;
    }
}
