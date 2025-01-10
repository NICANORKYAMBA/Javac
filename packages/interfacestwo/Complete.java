package interfacestwo;

public class Complete extends Incomplete {
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

    public static void main(String[] args) {
        Complete c = new Complete();
        c.a = 10;
        c.b = 20;
        c.show();
        c.callback(42);
        c.nonIfaceMethodOne();
        c.nonIfaceMethodTwo(5, 10);
        System.out.println("5 * 10 is " + c.nonIfaceMethodThree(5, 10));
    }
}