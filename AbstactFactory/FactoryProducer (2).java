package com.mode.AbstactFactory;

public class FactoryProducer {
    public static AFactory getFactory(String str){
        if(str.equalsIgnoreCase("Tyre")){
            return new CarTyreFactory();
        }else if(str.equalsIgnoreCase("Engine")){
            return new CarEngineFactory();
        }
        return null;
    }
}
