class StringDemo {
	public static void main(String[] args) {
		String strobj1 = "First String";
		String strobj2 = "Second String";
		String strobj3 = strobj1;

		System.out.println("Length of strobj1: " + strobj1.length());
		System.out.println("Char at index 3 in strobj1: " + strobj1.charAt(3));

		if (strobj1.equals(strobj2))
				System.out.println("strobj1 == strobj2");
		else
			System.out.println("strobj1 != strobj2");

		if (strobj1.equals(strobj3))
			System.out.println("strobj1 == strobj3");
		else
			System.out.println("strobj1 != strobj3");
	}
}
