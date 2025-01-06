package packageone;

public class Protection {
    int n = 1; // Default access
    private int n_pri = 2; // Private access
    protected int n_pro = 3; // Protected access
    public int n_pub = 4; // Public access

    public Protection() {
        System.out.println("Base constructor");
        System.out.println("n = " + n); // Accessible
        System.out.println("n_pri = " + n_pri); // Accessible
        System.out.println("n_pro = " + n_pro); // Accessible
        System.out.println("n_pub = " + n_pub); // Accessible
    }
}