package com.siemens.patterns.decorator;

public class Client {

    public static void main(String[] args) {
        // Shape circle = new Circle();
        // circle.draw();

        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();

    }

}
