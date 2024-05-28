// This program uses inheritance to extend box
class Box {
	double width;
	double height;
	double depth;

	// Construct clone of an object
	Box(Box ob) { // pass object constructor
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

	// Constructor used when cube is created
	Box(double len) {
		width = height = depth = len;
	}

	// Compute and return volume
	double volume() {
		return width * height * depth;
	}
}

// Here, Box is extended to include weight.
class BoxWeight extends Box {
	double weight;

	// Constructor for BoxWeight
	BoxWeight(double w, double h, double d, double m) {
		width = w;
		height = h;
		depth = d;
		weight = m;
	}
}

class RefDemo {
	public static void main(String[] args) {
		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
		Box plainbox = new Box();
		double vol;

		vol = weightbox.volume();

		System.out.println("Volume of weightbox is " + vol);
		System.out.println("Weight of weightbox is " + weightbox.weight);
		System.out.println();

		plainbox = weightbox;

		vol = plainbox.volume();

		System.out.println("Volume of plainbox is " + vol);

		/* The following statement is invalid because plainbox
		 * does not define a weight member
		 */
		// System.out.println("Weight of plainbox is " + plainbox.weight);
	}
}

