package com.mode.PrototypePatternShadow;
import java.lang.Object;
public class Rectangle implements Cloneable
{
	private Point p1;
	private  Point p2;
	private Method methods=null;
	public Rectangle()
	{
		this.p1=new Point();
		this.p2=new Point();
		this.methods=new Method();
	}
	
	public Object clone()
	{
		Rectangle clone=null;
		try
		{
			clone=(Rectangle)super.clone();
		}
        catch(CloneNotSupportedException e)
        {
        	System.out.println("Clone failure!");
        }
		return clone;
	}
	public Method getMethods(){
		return this.methods;
	}
	public void display()
	{
		System.out.println("两个对点:（"+p1.getX()+","+p1.getY()+") "+"("+p2.getX()+","+p2.getY()+")");
	}
}