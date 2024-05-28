// Using super to overcome name hiding
class A {
	int i;
}

// Create a subclass
class B extends A {
	int i; // This i hides i n A
	
	B(int a, int b) {
		super.i = a; // i in A
		i = b; // i in B
	}

	void show() {
		System.out.println("i in super class: " + super.i);
		System.out.println("i in sub class: " + i);
	}
}

class UseSuper {
	public static void main(String[] args) {
		B subObj = new B(3, 4);

		subObj.show();
	}
}
