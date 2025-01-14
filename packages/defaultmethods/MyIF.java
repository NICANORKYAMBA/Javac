package defaultmethods;

public interface MyIF {
    // NOTE: This is a "normal" interface method declaration.
    int getNumber();

    // This is a default method. Notice that it provides a default implementation.
    default String getString() {
        return "Default String";
    }
}
