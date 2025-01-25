package com.example.shapes;

public class Rectangle implements Shape {
    private double length;
    private double width;

    // constructor to initialize the length and width of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

// method to calculate the area of the rectangle
    @Override
    public double getArea() {
        return length * width;
    }

// method to calculate the perimeter of the rectangle
    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}
