package com.mode.Prototypedeep;
import java.io.*;
import java.io.IOException;
import java.io.OptionalDataException;

public class Rectangle implements Serializable
{
	private Point p1,p2;
	private Method methods=null;
	public Rectangle()
	{
		this.p1=new Point();
		this.p2=new Point();
		this.methods=new Method();
	}

	public Object deepClone() throws IOException, ClassNotFoundException, OptionalDataException
	{
	//将对象写入流中
	ByteArrayOutputStream bao=new ByteArrayOutputStream();
	ObjectOutputStream oos=new ObjectOutputStream(bao);
	oos.writeObject(this);

	//将对象从流中取出
	ByteArrayInputStream bis=new ByteArrayInputStream(bao.toByteArray());
	ObjectInputStream ois=new ObjectInputStream(bis);
	return(ois.readObject());
}
	public Method getMethods(){
		return this.methods;
	}
	public void display()
	{
		System.out.println("两个对点:（"+p1.getX()+","+p1.getY()+") "+"("+p2.getX()+","+p2.getY()+")");
	}
	
}