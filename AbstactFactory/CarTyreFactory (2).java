package com.mode.AbstactFactory;

public class CarTyreFactory extends AFactory
{
	public  CarTyre produceCarTyre( String type)
	{
	    if(type.equalsIgnoreCase("BMW")) return new BMWCarTyre();
		else if(type.equalsIgnoreCase("Benz")) return new BenzCarTyre();
		return null;
	}
	public CarEngine produceCarEngine(String engine){
	    return null;
    }
}