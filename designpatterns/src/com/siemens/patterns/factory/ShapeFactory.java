package com.siemens.patterns.factory;

public class ShapeFactory {

    public Shape getShape(String shapeType){
        Shape shape1=null;
        if (shapeType.equals("CIRCLE")) {
                shape1 = new Circle();
            } else if (shapeType.equals("RECTANGLE")) {
                shape1 = new Rectangle();
            } // any shapes the
        return shape1;
    }
}
