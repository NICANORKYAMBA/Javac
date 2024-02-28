import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int number = scanner.nextInt();

        System.out.println("Enter a String (A sentence): ");
        scanner.nextLine();
        String str = scanner.nextLine();

        System.out.println("Enter a Text (One word): ");
        String text = scanner.next();

        System.out.println("You Entered the Number: " + number);
        System.out.println("You Entered the String: " + str);
        System.out.println("You Entered the Text: " + text);

        scanner.close();
    }
}