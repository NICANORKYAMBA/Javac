// Dynamic Method Dispatch
class A {
	void callme() {
		System.out.println("Inside A's callme method");
	}
}

class B extends A {
	// Override callme()
	void callme() {
		System.out.println("Inside B's callme method");
	}
}

class C extends A {
	// Override callme()
	void callme() {
		System.out.println("Inside C's callme method");
	}
}

class Dispatch {
	public static void main(String[] args) {
		A a = new A(); // Object of type A
		B b = new B(); // Object of type B
		C c = new C(); // Object of type C

		A r; // Obtain a reference of type A

		r = a; // r refers to an A object
		r.callme(); // Calls A's version of callme

		r = b;
		r.callme();

		r = c;
		r.callme();
	}
}
