abstract class Payment {
	public abstract void processPayment();
}

class CreditCardPayment extends Payment {
	public void processPayment() {
		System.out.println("Processing credit card payment");
	}
}

class PayPalPayment extends Payment {
	public void processPayment() {
		System.out.println("Processing PayPal payment");
	}
}

class BankTransferPayment extends Payment {
	public void processPayment() {
		System.out.println("Processing bank transfer payment");
	}
}

class PaymentProcessor {
	public static void main(String[] args) {
		Payment payment;

		payment = new CreditCardPayment();
		payment.processPayment();

		payment = new PayPalPayment();
		payment.processPayment();

		payment = new BankTransferPayment();
		payment.processPayment();
	}
}
