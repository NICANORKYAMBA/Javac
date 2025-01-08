package interfaces;

public class Client implements Callback {
    // Implement callback's interface
    public void callback(int p) {
        System.out.println("Callback called with " + p);
    }
    
    // Other members can be defined in classes that implement interfaces
    void nonIfaceMethodOne() {
        System.out.println("Classes that implement interfaces may also define other members, too!");
    }

    // This method is not defined by Callback.
    void nonIfaceMethodTwo(int x, int y) {
        System.out.println("x * y is " + (x * y));
    }

    // This method is not defined by Callback.
    int nonIfaceMethodThree(int x, int y) {
        return x * y;
    }
}
