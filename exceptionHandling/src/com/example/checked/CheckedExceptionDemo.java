package com.example.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
    // This example demonstrates checked exception handling
    public static void checkedException() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("nonexistent.txt");
    }

    public static void main(String[] args) {
        try {
            checkedException();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }
    }
}