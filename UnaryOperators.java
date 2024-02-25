import java.io.*;

class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println("Post Increment : " + (a++));
        System.out.println("Pre Increment : " + (++a));
        System.out.println("Post Decrement : " + (b++));
        System.out.println("Pre Decrement : " + (--b));
    }
}