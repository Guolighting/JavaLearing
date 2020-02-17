package com.mode.Flyweight.NSM2;
public class Switch implements NetworkDevice {
    private String type;
    public Switch(String type){
        this.type=type;
    }
    public String getType(){
        return this.type;
    }
    public void use(Port port){
        System.out.println("Linked by switch,port is"+port.getPort());
    }
}