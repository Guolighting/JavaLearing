package com.mode.AbstactFactory;

public abstract class AFactory
{
	public abstract CarTyre produceCarTyre(String type);
	public abstract CarEngine produceCarEngine(String engine);
}