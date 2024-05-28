// A complete implementation of BoxWeight
class Box {
	private double width;
	private double height;
	private double depth;

	// Construct clone of an object
	Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// Constructor used when all dimensions specified
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// Constructor used when no dimensions specified
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// Constructor used when a cube is created
	Box(double len) {
		width = height = depth = len;
	}

	// Compute and return volume
	double volume() {
		return width * height * depth;
	}
}

// BoxWeight now fully implements all constructors
class BoxWeight extends Box {
	double weight;

	// Construct clone of an object
	BoxWeight(BoxWeight ob) {
		super(ob);
		weight = ob.weight;
	}

	// Constructor when all parameters are specified
	BoxWeight(double w, double h, double d, double m) {
		super(w, h, d);
		weight = m;
	}

	// Default constructor
	BoxWeight() {
		super();
		weight = -1;
	}

	// Constructor used when cube is created
	BoxWeight(double len, double m) {
		super(len);
		weight = m;
	}
}

class DemoSuper {
	public static void main(String[] args) {
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
		BoxWeight mybox3 = new BoxWeight(); // Default
		BoxWeight mycube = new BoxWeight(3, 2);
		BoxWeight myclone = new BoxWeight(mybox1);
		double vol;

		vol = mybox1.volume();
		System.out.println("Volume of mybox1 is " + vol);
		System.out.println("Weight of mybox1 is " + mybox1.weight);
		System.out.println();

		vol = mybox2.volume();
		System.out.println("Volume of mybox2 is " + vol);
		System.out.println("Weight of mybox2 is " + mybox2.weight);
		System.out.println();

		vol = mybox3.volume();
		System.out.println("Volume of mybox3 is " + vol);
		System.out.println("Weight of mybox3 is " + mybox3.weight);
		System.out.println();

		vol = myclone.volume();
		System.out.println("Volume of myclone is " + vol);
		System.out.println("Weight of mycone is " + myclone.weight);
		System.out.println();

		vol = mycube.volume();
		System.out.println("Volume of mycube is " + vol);
		System.out.println("Weight of mycube is " + mycube.weight);
		System.out.println();
	}
}
