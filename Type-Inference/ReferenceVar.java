class Animal {
	String name;

	public Animal(String name) {
		this.name = name;
	}

	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	void makeSound() {
		System.out.println("Dog barks");
	}
}

class ReferenceVar {
	public static void main(String[] args) {
		Animal myAnimal = new Animal("Generic Animal");
		Animal myDog = new Dog("Buddy");

		myAnimal.makeSound();
		myDog.makeSound();

		// Upcasting
		Animal anotherDog = new Dog("Max");
		anotherDog.makeSound();

		// Downcasting
		if (anotherDog instanceof Dog) {
			Dog specificDog = (Dog) anotherDog;
			specificDog.makeSound();
		}

		// Passing reference veariables to methods
		printAnimalName(myAnimal);
		printAnimalName(myDog);

		// Modifying objects through reference variables
		changeAnimalName(myAnimal, "Changed Animal");
		System.out.println(myAnimal.name);
	}

	public static void printAnimalName(Animal animal) {
		System.out.println("Name: " + animal.name);
	}

	public static void changeAnimalName(Animal animal, String newName) {
		animal.name = newName;
	}
}
