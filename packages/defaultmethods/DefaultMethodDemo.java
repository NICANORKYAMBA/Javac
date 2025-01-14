package defaultmethods;

public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj1 = new MyIFImp();
        MyIFImp2 obj2 = new MyIFImp2();

        // Can call getNumber(), because it is explicitly implemented by MyIFImp:
        System.out.println(obj1.getNumber());
        // Can also call getString(), because of default implementation:
        System.out.println(obj1.getString());

        // Can call getNumber(), because it is explicitly implemented by MyIFImp2:
        System.out.println(obj2.getNumber());
        // Can also call getString(), because it is overridden in MyIFImp2:
        System.out.println(obj2.getString());
    }
}