package packageone;

class Derived extends Protection {
    Derived() {
        System.out.println("Derived constructor");
        System.out.println("n = " + n); // Accessible (default access within the same package)
        // System.out.println("n_pri = " + n_pri); // Not accessible (private access)
        System.out.println("n_pro = " + n_pro); // Accessible (protected access)
        System.out.println("n_pub = " + n_pub); // Accessible (public access)
    }  
}