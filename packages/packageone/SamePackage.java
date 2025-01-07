package packageone;

class SamePackage {
    SamePackage() {
        Protection p = new Protection();
        System.out.println("SamePackage constructor");
        System.out.println("n = " + p.n); // Accessible (default access within the same package)
        // System.out.println("n_pri = " + p.n_pri); // Not accessible (private access)
        System.out.println("n_pro = " + p.n_pro); // Accessible (protected access within the same package)
        System.out.println("n_pub = " + p.n_pub); // Accessible (public access)
    }
}