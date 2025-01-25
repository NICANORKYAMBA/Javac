package com.example.shapes;

public class Circle implements Shape {
    private int radius; // radius of the circle
    
    // constructor to initialize the radius of the circle
    public Circle(int radius) {
        this.radius = radius;
    }
    
    // method to calculate the area of the circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    // method to calculate the perimeter of the circle
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}