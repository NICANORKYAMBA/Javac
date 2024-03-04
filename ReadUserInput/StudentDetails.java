package ReadUserInput;

import java.io.*;

public class StudentDetails {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter your name: ");
            String name = br.readLine();

            System.out.println("Enter your age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.println("Enter your ID: ");
            Long id = Long.parseLong(br.readLine());

            System.out.println("Your name is " + name);
            System.out.println("Your age is " + age);
            System.out.println("Your ID is " + id);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}