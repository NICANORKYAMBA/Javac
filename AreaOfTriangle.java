import java.lang.*;
import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		int a, b, c;
		double s, area;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the three sides of the Triangle: ");

		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

		s = (a + b + c) / 2;

		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

		System.out.println("Area of your Triangle is: " + area);
	}
}
