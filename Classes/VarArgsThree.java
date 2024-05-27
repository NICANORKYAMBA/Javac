// Varargs and overloading
class VarArgsThree {

	static void vaTest(int ... v) {
		System.out.print("vaTest(int ...): " + "Number of args: "
				+ v.length + " Contents: ");

		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	static void vaTest(boolean ... v) {
		System.out.print("vaTest(boolean ...): " + "Number of args: "
				+ v.length + " Contents: ");

		for (boolean x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	static void vaTest(String msg, int ... v) {
		System.out.print("vaTest(String, int ...): " +
				msg + v.length + 
				" Contents: ");

		for (int x : v)
			System.out.print(x + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		vaTest(1, 2, 3, 6, 7,8, 9, 9);
		vaTest("Testing: ", 10, 30, 40, 80, 99, 56, 34, 59);
		vaTest(true, false, false, true, true, false);
	}
}
