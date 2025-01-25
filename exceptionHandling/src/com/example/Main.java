package com.example;

import com.example.exceptions.CustomException;
import com.example.shapes.Circle;
import com.example.shapes.Rectangle;
import com.example.shapes.Shape;
import com.example.utils.AdvancedMathUtils;
import com.example.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        // create a circle object
        Shape circle = new Circle(7);

        // calculate and print area and perimeter of the circle
        System.out.println("Area of the circle: " + AdvancedMathUtils.calculateArea(circle));
        System.out.println("Perimeter of the circle: " + AdvancedMathUtils.calculatePerimeter(circle));

        // create a rectangle object
        Shape rectangle = new Rectangle(5, 10);

        // calculate and print area and perimeter of the rectangle
        System.out.println("\nArea of the rectangle: " + AdvancedMathUtils.calculateArea(rectangle));
        System.out.println("Perimeter of the rectangle: " + AdvancedMathUtils.calculatePerimeter(rectangle));

        // try to calculate and print volume of the circle (unsupported operation)
        try {
            System.out.println("\nVolume of the circle: " + AdvancedMathUtils.calculateVolume(circle));
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\nProgram completed successfully.");
        }

        // Exception handling example
        try {
            int result = MathUtils.divide(10, 0);
            System.out.println("Result: " + result);
        } catch (CustomException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}