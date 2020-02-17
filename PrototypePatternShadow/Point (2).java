package com.mode.PrototypePatternShadow;

public class Point {
    private int X,Y;
    public Point(int x,int y){
        this.X=x;
        this.Y=y;
    }
    public Point(){
    }
    int getX(){
        return X;
    }
    int getY(){
        return Y;
    }
}
