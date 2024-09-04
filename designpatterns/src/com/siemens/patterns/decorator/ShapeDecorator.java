package com.siemens.patterns.decorator;

abstract public class ShapeDecorator implements Shape{

    protected Shape decorateShape;

    public ShapeDecorator(Shape decoratShape){
        this.decorateShape = decoratShape;
    }

    public void draw(){
        decorateShape.draw();
    }
}
