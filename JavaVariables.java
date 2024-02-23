public class JavaVariables {
	String name  = "Nicanor Kyamba";
	String nickName = "Nick";
	String description = "My nick name is " + nickName + " and I love Java";

	public static void main(String[] args) {
		JavaVariables javaVariables = new JavaVariables();


		System.out.println("Hello World!");
		System.out.println("My name is " + javaVariables.name);
		System.out.println(javaVariables.description);
		System.out.println("Thank you for your time");
	}
}
