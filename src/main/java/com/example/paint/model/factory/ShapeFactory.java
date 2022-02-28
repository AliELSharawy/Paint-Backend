package com.example.paint.model.factory;

import com.example.paint.model.*;

public class ShapeFactory implements IShapeFacory {

    @Override
    public Shape createShape(String name) {

        switch (name) {
            case "rectangle":
                return new Rectangle();
            case "circle":
                return new Circle();
            case "ellipse":
                return new Ellipse();
            case "triangle":
            case "rightTri":
                return new Triangle();
            case "line":
                return new LineSegment();
            default:
                return null;
        }
    }
}
