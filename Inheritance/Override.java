// Method overriding
class A {
	int i, j;
	
	A(int a, int b) {
		i = a;
		j = b;
	}

	// Display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class B extends A {
	int k;

	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}

	// Display k - this overrides show() in A
	void show() {
		System.out.println("k: " + k);
	}
}

class Override {
	public static void main(String[] arsg) {
		B subObj = new B(1, 2, 4);

		subObj.show(); // Calls show() in B
	}
}
