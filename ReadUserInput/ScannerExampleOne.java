package ReadUserInput;

import java.util.Scanner;

public class ScannerExampleOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, count = 0;

        System.out.println("Enter integers (enter -1 to finish):");

        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            sum += num;
            count++;
        }

        if (count > 0) {
            int mean = sum / count;

            System.out.println("Mean of your Numbers is: " + mean);
        } else {
            System.out.println("No integers were passed as Input. Mean cannot be calculated!");
        }

        sc.close();
    }
}
