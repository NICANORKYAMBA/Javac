import java.util.*;

class UserInput {
	public static void main(String[] args) {
		int a, b, sum = 0, product = 0;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the first Number: ");
		a = scan.nextInt();

		System.out.println("Enter the second Number: ");
		b = scan.nextInt();

		sum = a + b;
		product = a * b;

		System.out.println("Sum of your two Numbers is: " + sum);
		System.out.println("Product of your two Numbers is: " + product);
	}
}
