package com.example.customexception;

public class MyException extends Exception {
    private int detail;

    public MyException(int a) {
        detail = a;
    }

    @Override
    public String toString() {
        return "MyException[" + detail + "]";
    }
}