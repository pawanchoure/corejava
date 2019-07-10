package com.pawan.choure.interfaces;

public class BankAccount implements Measurable{

	public BankAccount(int i) {
	}

	public double getMeasures()
	{
		return 45;
	}
	
	public int getAccountNumber()
	{
		return 100;
		
	}
	
	public static void main(String[] argd){
		BankAccount account=new BankAccount(1000);
		
		/*
		 * Converting Class to interface is legal
		 * We have converted BankAccount to Measurable interface
		 */
		Measurable x=account;
		
		
		/*
		 * Converting back interface to the Class
		 */
		
		BankAccount dummyAccount=(BankAccount) x;
		System.out.println("getAccountNumber :"+ dummyAccount.getAccountNumber());
		
		Measurable m=new BankAccount(1);
		
	}
}
