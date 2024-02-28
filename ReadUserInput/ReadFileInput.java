package ReadUserInput;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileInput {
    public static void main(String[] args) {
        try {
            File file = new File("input.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                System.out.println("Line read from file: " + line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
