package mypackagetwo;

class ProtectionTwo extends packageone.Protection {
    ProtectionTwo() {
        System.out.println("Derived constructor");
        // System.out.println("n = " + n); // Not accessible (default access)
        // System.out.println("n_pri = " + n_pri); // Not accessible (private access)
        System.out.println("n_pro = " + n_pro); // Accessible (protected access) because it is a subclass of Protection Class
        System.out.println("n_pub = " + n_pub); // Accessible (public access)
    }
}