public class LocalVariable {
    public static void main(String[] args) {
        int x = 10;

        String message = "Hello, World!";
        String result = "X is greater than 5";
        String loopMessage = "Iteration ";

        System.out.println("x = " + x);

        System.out.println("Message = " + message);

        if (x > 5) {
            //String result = "X is greater than 5";

            System.out.println(result);
        }

        int i;

        for (i = 0; i < 3; i++) {
            //String loopMessage = "Iteration " + i;
            //System.out.println(loopMessage);

            System.out.println(loopMessage + i);
        }
    }
}