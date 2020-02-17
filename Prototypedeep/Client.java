package com.mode.Prototypedeep;
public class Client
{
	public static void main(String args[])
	{
		Customer customer, copyCustomer =null;
		customer =new Customer();
		try{
			copyCustomer =(Customer) customer.deepClone();
		}
		catch (Exception e){
			e.printStackTrace();
		}
		
		System.out.println("customer==copyCustomer?");
		System.out.println(customer == copyCustomer);
		
		System.out.println("customer.getAddress==copyCustomer.getAddress?");
		System.out.println(customer.getAddress()== copyCustomer.getAddress());
	}
}