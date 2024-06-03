class Animal {
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	void makeSound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal {
	void makeSound() {
		System.out.println("Cat meows");
	}
}

class Cow extends Animal {
	void makeSound() {
		System.out.println("Cow moo");
	}
}

class AnimalsTwo {
	public static void main(String[] args) {
		Animal myAnimal;

		myAnimal = new Dog();
		myAnimal.makeSound();

		myAnimal = new Cat();
		myAnimal.makeSound();

		myAnimal = new Cow();
		myAnimal.makeSound();
	}
}
