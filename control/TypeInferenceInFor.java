class TypeInferenceInFor {
	public static void main(String[] args) {

		System.out.print("Values of x: ");

		for (var x = 2.5; x < 100.0; x = x * 2)
			System.out.print(x + " ");

		System.out.println();

		int nums [] = {1, 2, 3, 4, 5, 6, 7};
		System.out.print("Values in nums array: ");

		for (var v : nums)
			System.out.print(v + " ");

		System.out.println();
	}
}
