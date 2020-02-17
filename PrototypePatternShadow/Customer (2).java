package com.mode.PrototypePatternShadow;
import java.lang.Object;
public class Customer implements Cloneable
{
	private Address address =null;
	public Customer()
	{
		this.address =new Address();
	}
	
	public Object clone()
	{
		Customer clone=null;
		try
		{
			clone=(Customer)super.clone();
		}
        catch(CloneNotSupportedException e)
        {
        	System.out.println("Clone failure!");
        }
		return clone;
	}
	public Address getAddress(){
		return this.address;
	}
}