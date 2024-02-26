public class InstanceVariable {
    int instanceVar;

    public void setInstanceVar(int value) {
        instanceVar = value;
    }

    public void printInstanceVar() {
        System.out.println("Instance Variable " + instanceVar);
    }

    public static void main(String[] args) {
        InstanceVariable obj = new InstanceVariable();
        obj.setInstanceVar(20);
        obj.printInstanceVar();
    }
}