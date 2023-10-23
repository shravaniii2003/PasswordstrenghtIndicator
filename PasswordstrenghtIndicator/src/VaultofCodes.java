import java.util.Scanner;

public class VaultofCodes {
    public static void main(String[] args) {
        int upChars = 0, lowChars = 0, specialChars = 0, digits = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Password: ");
        String password = scanner.nextLine();
        scanner.close();

        int total = password.length();

        {
            for (int i = 0; i < total; i++) {
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch)) {
                    upChars = 1;
                } else if (Character.isLowerCase(ch)) {
                    lowChars = 1;
                } else if (Character.isDigit(ch)) {
                    digits = 1;
                } else {
                    specialChars = 1;
                }
            }

            if (upChars == 1 && lowChars == 1 && digits == 1 && specialChars == 1)
                System.out.println("\nThe Password is Strong.");
            else if (total <= 8) {
                if (total >= 6) {
                    System.out.println("\nThe Password is Medium.");
                } else {
                    System.out.println("\nThe Password is Weak.");
                }
            }
        }
    }
}
