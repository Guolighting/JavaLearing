package com.mode.PrototypePatternShadow;

public class Client
{
	public static void main(String a[])
	{
		Rectangle rectangle, copyRectangle;
		rectangle =new Rectangle();
		copyRectangle =(Rectangle) rectangle.clone();
		
		System.out.println("rectangle==copyRectangle?");
		System.out.println(rectangle == copyRectangle);
		
		System.out.println("rectangle.getMethods==copyRectangle.getMethods?");
		System.out.println(rectangle.getMethods()== copyRectangle.getMethods());
	}
}