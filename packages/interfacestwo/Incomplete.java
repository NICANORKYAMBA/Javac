package interfacestwo;

abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }

    // callback() method is not implemented here, so the class should be declared abstract.
}
