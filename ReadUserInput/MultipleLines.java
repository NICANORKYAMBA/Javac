package ReadUserInput;

import java.util.Scanner;

public class MultipleLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miltiples lines of text (type 'done' to finish:)");

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("done")) {
                break;
            }
            System.out.println("You Entered: " + line);
        }

        scanner.close();
    }

}
