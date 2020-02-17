package com.mode.Flyweight.NSM2;


import com.mode.Flyweight.NSM1.NetworkDevice;

import java.util.ArrayList;

public class DeviceFactory {
    private ArrayList devices=new ArrayList();
    private int totalTerminal=0;
    public NetworkDevice getNetworkDevice(String type){
        if(type.equalsIgnoreCase("cisco")){
            totalTerminal++;
            return (NetworkDevice)devices.get(0);
        }
        else if(type.equalsIgnoreCase("tp")){
            totalTerminal++;
            return (NetworkDevice)devices.get(1);
        }
        else{
            return null;
        }
    }
    public int getTotalDevice(){
        return devices.size();
    }
    public int getTotalTerminal(){
        return totalTerminal;
    }
}
