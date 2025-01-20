package multipleinheritance;

public interface Beta extends Alpha {
    default void reset() {
        System.out.println("Beta reset");
    }
}
