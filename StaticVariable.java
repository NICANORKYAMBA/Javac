public class StaticVariable {
    static int classVar;

    public static void setClassVar(int value) {
        classVar = value;
    }

    public static void printClassVar() {
        System.out.println("Class Variable: " + classVar);
    }

    public static void main(String[] args) {
        StaticVariable.setClassVar(35);
        StaticVariable.printClassVar();
    }
}