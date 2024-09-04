package com.siemens.patterns.decorator;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratorShape){
        super(decoratorShape);
    }

    public void draw(){
        decorateShape.draw();
        setRedBorder(decorateShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
