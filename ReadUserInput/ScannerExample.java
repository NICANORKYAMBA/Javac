package ReadUserInput;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading Integer
        System.out.println("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered: " + intValue);

        // Reading Double
        System.out.println("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered: " + doubleValue);

        // Reading a String
        System.out.println("Enter a string: ");
        String stringValue = scanner.next();
        System.out.println("You entered: " + stringValue);

        scanner.close();
    }
}
