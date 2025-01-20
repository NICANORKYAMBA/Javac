package multipleinheritance;

public class MyClass implements Alpha, Beta {
    @Override
    public void reset() {
        Beta.super.reset();
        System.out.println("MyClass reset");
    }
}
