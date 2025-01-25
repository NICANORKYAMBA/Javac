package com.example.utils;

import com.example.exceptions.CustomException;

public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) throws CustomException {
        if (b == 0) {
            throw new CustomException("Cannot divide by zero");
        }
        return a / b;
    }
}