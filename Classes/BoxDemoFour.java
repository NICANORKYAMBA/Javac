class Box {
	double width;
	double height;
	double depth;

	double volume() {
		return width * height * depth;
	}
}

class BoxDemoFour {
	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		double vol;

		mybox1.height = 10;
		mybox1.width = 20;
		mybox1.depth = 15;

		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;

		vol = mybox1.volume();
		System.out.println("Volume is " + vol);

		vol = mybox2.volume();
		System.out.println("Volume is " + vol);
	}
}
