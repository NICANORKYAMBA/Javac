package com.example.supersubcatch;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / a;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException catch.");
        } catch (Exception e) {
            System.out.println("Generic Exception catch.");
        }
    }
}