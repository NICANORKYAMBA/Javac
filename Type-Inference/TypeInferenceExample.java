import java.util.List;

public class TypeInferenceExample {
	public static void main(String[] args) {
		var number = 10;
		var message = "Hello, World! New to Java Programming?";
		var list = List.of(1, 2, 3, 4, 5);
		var person = new Person();
		var person2 = new Person("Michael Smith", 15, "Graffiti Artist");

		System.out.println(number);
		System.out.println(message);
		System.out.println(list);
		System.out.println(person.printDetails());
		System.out.println(person2.printDetails());
	}
}

class Person {
	String name;
	int age;
	String profession;

	Person(String name, int age, String profession) {
		this.name = name;
		this.age = age;
		this.profession = profession;
	}

	Person() {
		this("John Doe", 30, "Software Developer");
	}

	String printDetails() {
		return "Name: " + name + "\nAge: " + age + "\nProfession: " + profession;
	}

}
