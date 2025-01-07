package mypackagetwo;

class OtherPackage {
    OtherPackage() {
        packageone.Protection p = new packageone.Protection();
        System.out.println("OtherPackage constructor");
        // System.out.println("n = " + p.n); // Not accessible (default access). Only accessible within the same package
        // System.out.println("n_pri = " + p.n_pri); // Not accessible (private access) because it is private to Protection Class and thus only accessible within Protection Class
        // System.out.println("n_pro = " + p.n_pro); // Not accessible (protected access) because it is not a subclass of Protection Class
        System.out.println("n_pub = " + p.n_pub); // Accessible (public access)
    }
}