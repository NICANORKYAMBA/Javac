import java.util.Scanner;

public class FahrenheitConverter {
	public static void main(String[] args) {
		double c, f;

		Scanner s = new Scanner(System.in);

		System.out.print("Enter temperature in Fahrenheit: ");

		f = s.nextDouble();
		c = (5.0 / 9.0) * (f - 32);

		System.out.println("Temperature in Celcius is: " + c);
	}
}
