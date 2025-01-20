package defaultmethodstwo;

public interface MyIF {
    // This is a "normal" interface method declaration.
    int getNumber();

    // This is a default method. Notice that it provides a default implementation.
    default String getString() {
        return "Default String";
    }

    // This is a static interface method.
    static int getDefaultNumber() {
        return 0;
    }
}
