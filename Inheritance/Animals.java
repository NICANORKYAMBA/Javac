class Animal {
	public void eat() {
		System.out.println("Animal eats food");
	}

	public void sleep() {
		System.out.println("Animal sleeps in the night");
	}

	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("Dog barks");
	}

	public void eat() {
		System.out.println("Dog eats bones");
	}

	public void sleep() {
		System.out.println("Dog sleeps in the morning");
	}
}

class Animals {
	public static void main(String[] args) {
		Animal myDog = new Dog();
		Animal myAnimal = new Animal();

		myDog.eat();
		myDog.sleep();
		myDog.sound();

		myAnimal.eat();
		myAnimal.sleep();
		myAnimal.sound();
	}
}
