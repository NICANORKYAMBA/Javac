package com.example.utils;

import com.example.exceptions.CustomException;
import com.example.shapes.Shape;

public class AdvancedMathUtils {
    public static double calculateArea(Shape shape) {
        return shape.getArea();
    }

    public static double calculatePerimeter(Shape shape) {
        return shape.getPerimeter();
    }

    public static double calculateVolume(Shape shape) throws CustomException {
        throw new CustomException("Volume calculation not supported for this shape");
    }
}
