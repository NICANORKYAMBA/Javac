// Varargs, overloading and ambiguity
//
// This program contains an error and will not compile
//
class VarArgsFour {

	static void vaTest(int ... v) {
		System.out.print("vaTest(int ...): " + "Number of args: " + v.length
				+ " Contents: ");

		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	static void vaTest(boolean ... v) {
		System.out.print("vaTest(boolean ...): " + "Number of args: " +
				v.length + " Contents: ");

		for (boolean x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		vaTest(1, 2, 3, 5, 6);
		vaTest(true, false, false, true, false);
		vaTest(); // Error: Ambiguous!
	}
}
