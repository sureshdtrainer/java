package com.siemens.patterns.factory;

public class Client {

    public static void main(String[] args) {
        // Take input from the user and draw that
        String shapeInput = "CIRCLE";

        ShapeFactory shapeFactory= new ShapeFactory();
        Shape shape1 = shapeFactory.getShape(shapeInput);

        shape1.draw();
        // if (shapeInput.equals("CIRCLE")) {
        //     shape1 = new Circle();
        // } else if (shapeInput.equals("RECTANGLE")) {
        //     shape1 = new Rectangle();
        // } // any shapes the if else condition increase

        
    }

}
