package ReadUserInput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExampleTwo {

    public static void main(String[] args) {
        try {
            // Create a FileReader to read from a file
            FileReader fileReader = new FileReader("example.txt");

            // Wrap the FileReader in a BufferedReader
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Use a String to hold each line of text
            String line;

            // Read lines from the file until there are no more lines
            while ((line = bufferedReader.readLine()) != null) {
                // Print each line
                System.out.println(line);
            }

            // Close the BufferedReader
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
