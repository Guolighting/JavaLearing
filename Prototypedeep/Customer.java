package com.mode.Prototypedeep;
import java.io.*;
import java.io.IOException;
import java.io.OptionalDataException;

public class Customer implements Serializable
{
	private Address address =null;
	public Customer()
	{
		this.address =new Address();
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
	public Address getAddress(){
		return this.address;
	}
}