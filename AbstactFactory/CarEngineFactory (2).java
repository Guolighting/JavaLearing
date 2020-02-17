package com.mode.AbstactFactory;

public class CarEngineFactory extends AFactory
{
    public  CarTyre produceCarTyre( String type){
        return null;
    }
	public CarEngine produceCarEngine(String engine)
	{
		if(engine.equalsIgnoreCase("BMW")) return new BMWCarEngine();
		else if(engine.equalsIgnoreCase("Benz"))return new BenzCarEngine();
		return null;
	}
}