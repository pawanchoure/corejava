package com.pawan.choure.statics;

public class StaticFields {

	/*
	 * A Static field belongs to the class
	 * Not to any object of the class
	 */
	
	//Pre initialized static field
	private static int accountNumber=1000;
	private String AccountName;
	private int AccountBalance;
	private static int lockerNumber;
	
	static
	{
		lockerNumber=lockerNumber;
	}
	
	public StaticFields(String name,int balance)
	{
		accountNumber++;
		AccountName=name;
		AccountBalance=balance;
		
	}
	
	 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StaticFields a1=new StaticFields("Pawan", 1000);
		System.out.println("Account Number :"+  a1.accountNumber + a1.AccountName +a1.AccountBalance + a1.lockerNumber);
		StaticFields a2=new StaticFields("Ramesh", 1000);
		System.out.println("Account Number :"+  a2.accountNumber + a2.AccountName +a2.AccountBalance+ + a2.lockerNumber);

		/*
		 *  Account Number :1001Pawan1000
			Account Number :1002Ramesh1000
		 */
	}

}
