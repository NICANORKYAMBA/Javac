class InstanceOfOperator {
    public static void main(String[] args) {
        Person obj1 = new Person();
        Person obj2 = new Boy();

        System.out.println("Obj1 instanceof Person: " + (obj1 instanceof Person));
        System.out.println("Obj1 instanceof Boy: " + (obj1 instanceof Boy));
        System.out.println("Obj1 instanceof MyInterface: " + (obj1 instanceof MyInterface));

        System.out.println("Obj2 instanceof Person: " + (obj2 instanceof Person));
        System.out.println("Obj2 instanceof Boy: " + (obj2 instanceof Boy));
        System.out.println("Obj2 instanceof MyInterface: " + (obj2 instanceof MyInterface));
    }
}

class Person {

}

class Boy extends Person implements MyInterface {

}

interface MyInterface {

}