package defaultmethodstwo;

// Implement MyIF with an override for the default method.
public class MyIFImp2 implements MyIF {
    // Here, implementations for both getNumber() and getString() are provided.
    public int getNumber() {
        return 50;
    }

    public String getString() {
        return "This is a different string.";
    }
}
