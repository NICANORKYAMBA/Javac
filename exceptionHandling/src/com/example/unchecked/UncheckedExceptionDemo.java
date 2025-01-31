package com.example.unchecked;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] denom = { 1, 0, 3, 0, 5 };
        for (int i = 0; i < nums.length; i++) {
            try {
                System.out.println(nums[i] + " / " + denom[i] + " is " + nums[i] / denom[i]);
            } catch (ArithmeticException e) {
                System.out.println("Can't divide by zero! " + e);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("No matching element found. " + e);
            }
        }
    }
}
