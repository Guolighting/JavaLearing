package com.mode.Flyweight.NSM1;

public class Hub implements NetworkDevice {
    private String type;
    public Hub(String type){
        this.type=type;
    }
    public String getType(){
        return this.type;
    }
    public void use(){
        System.out.println("Linked by Hub is"+this.type);
    }
}
