package com.example.handled;

public class Exc2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic exception occurred: " + e);
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
