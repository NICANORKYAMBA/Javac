package interfaces;

public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        // Create an object of the Client class and assign its reference to the Callback interface.
        c.callback(42);
        
        // Assign the reference of the AnotherClient class to the Callback interface.
        c = ob; // Now c refers to AnotherClient object.
        c.callback(42);
    }
}
