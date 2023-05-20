package javaCodingPractice;
import java.util.Scanner;
public class C07 {
    public static void main(String[] args) {
        /*
        Password Validation
1. Password MUST be at least 8 characters
2. Password should at least contain one uppercase letter
3. Password should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
if all requirements above are met, the password is valid, if not all are met it isinvalid

         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid password!");
        } else {
            System.out.println("Invalid password!");
        }
    }

    public static boolean isValidPassword(String password) {
        // Check if password is at least 8 characters long
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;

        // Check each character in the password
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (isSpecialCharacter(ch)) {
                hasSpecialChar = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }

        // Check if all requirements are met
        return hasUppercase && hasLowercase && hasSpecialChar && hasDigit;
    }

    public static boolean isSpecialCharacter(char ch) {
        // Define special characters as per your requirement
        String specialCharacters = "!@#$%^&*()_+{}|:\"<>?-=[]\\;',./~`";

        return specialCharacters.contains(Character.toString(ch));
    }

    }
