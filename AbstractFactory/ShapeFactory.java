package com.mode.AbstractFactory;

public abstract class ShapeFactory extends AbstractFactory {
public Shape getShape(String shapeType){
    if(shapeType==null){
        return null;
    }
    if(shapeType.equalsIgnoreCase("circle")){
        return new Circle();
    }
    else if(shapeType.equalsIgnoreCase("Rectangle")){
        return new Rectangle();
    }
    else if(shapeType.equalsIgnoreCase("Square")){
        return new Square();
    }
    return null;
}
}
