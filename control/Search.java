class Search {
	public static void main(String[] args) {
		int nums [] = {6, 8, 3, 7, 5, 6, 1, 4};
		int val = 7;
		boolean found = false;

		for (int x : nums) {
			System.out.println("Count at: " + x);
			if (x == val) {
				found = true;
				break;
			}
		}

		if (found)
			System.out.println("Value found: " + val);
	}
}
