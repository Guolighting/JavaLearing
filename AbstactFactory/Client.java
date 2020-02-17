package com.mode.AbstactFactory;

public class Client
{
	public static void main(String args[])
	{

         	AFactory tyrefactory=FactoryProducer.getFactory("Tyre");
         	CarTyre tyre=tyrefactory.produceCarTyre("BMW");
         	tyre.use();
		   AFactory enginefactory=FactoryProducer.getFactory("Engine");
	     	CarEngine engine=enginefactory.produceCarEngine("BMW");
		   engine.makemove();
		AFactory tyrefactory1=FactoryProducer.getFactory("Tyre");
		CarTyre tyre1=tyrefactory1.produceCarTyre("Benz");
		tyre1.use();
		AFactory enginefactory1=FactoryProducer.getFactory("Engine");
		CarEngine engine1=enginefactory1.produceCarEngine("Benz");
		engine1.makemove();
	}
}
