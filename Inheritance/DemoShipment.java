// Extend BoxWeight to include shipping cost
//
// Start with Box
class Box {
	double width;
	double height;
	double depth;

	// Construct clone of an object
	Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}

	// Constructor when all dimensions are provided
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}

	// Constructor when no dimensions are provided
	Box() {
		width = -1;
		height = -1;
		depth = -1;
	}

	// Constructor use when a cube is created
	Box(double len) {
		width = height = depth = len;
	}

	// Compute and return volume
	double volume() {
		return width * height * depth;
	}
}

// Add weight
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

// Adding shipping costs
class Shipment extends BoxWeight {
	double cost;

	// Construct clone of an object
	Shipment(Shipment ob) {
		super(ob);
		cost = ob.cost;
	}

	// Constructor when all paramaters are specified
	Shipment(double w, double h, double d, double m, double c) {
		super(w, h, d, m);
		cost = c;
	}

	// Default constructor
	Shipment() {
		super();
		cost = -1;
	}

	// Constructor used when cube is created
	Shipment(double len, double m, double c) {
		super(len, m);
		cost = c;
	}
}

class DemoShipment {
	public static void main(String[] args) {
		Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
		Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
		double vol;

		vol = shipment1.volume();
		System.out.println("Volume of shipment1 is " + vol);
		System.out.println("Weight of shipment1 is " + shipment1.weight);
		System.out.println("Shipping cost: $" + shipment1.cost);
		System.out.println();

		vol = shipment2.volume();
		System.out.println("Volume of shipment2 is " + vol);
		System.out.println("Weight of shipment2 is " + shipment2.weight);
		System.out.println("Shipping cost: $" + shipment2.cost);
		System.out.println();
	}
}
