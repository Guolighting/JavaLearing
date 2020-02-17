package com.mode.Prototypedeep;

import java.io.Serializable;

public class Point implements Serializable{
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
