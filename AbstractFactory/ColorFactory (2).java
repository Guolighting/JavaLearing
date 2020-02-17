package com.mode.AbstractFactory;
public class ColorFactory extends AbstractFactory{
    public Shape getShape(String shapeType){
        return null;
    }
    public Color getColor(String color) {
        if(color==null){
            return null;
        }
        if(color.equalsIgnoreCase("red")){
            return new Red();
        }
        else if(color.equalsIgnoreCase("Green")){
            return new Green();
        }
        else if(color.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        return null;
    }
}
