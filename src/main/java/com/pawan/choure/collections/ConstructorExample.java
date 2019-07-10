package com.pawan.choure.collections;

public class ConstructorExample {
	private double balanceAmount;
	
	public ConstructorExample()
	{
		System.out.println("Contructor 0");
	}
	public ConstructorExample(int i)
	{
		this();
		System.out.println("Contructor 1");
	}

	public ConstructorExample(double i)
	{
		//Calling one constructor from another having (double,String) as input parameter
		this(2.0,"ketu");
		System.out.println("Contructor 2");
		
	}
	public ConstructorExample(double i,String j)
	{
		//Calling one constructor from another with int as input parameter
		this(0);
		System.out.println("Contructor 3");
		
	}
	
	/**
	 * Method to add two number
	 * @param i integer input
	 * @param j double input
	 */
	public double addNumber(int i,double j)
	{
		//Calling implicit Parameter using this.balanceAmount or just
		//balanceAmount
		this.balanceAmount=i+j;
		return balanceAmount;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/** Testing constructor Behavior
		 * @param Input to the constructor having double as input parameter
		 */
		ConstructorExample constructor1=new ConstructorExample(45.45);
		
		/**
		 * Adding two Number
		 */
		constructor1.addNumber(10,10.00);
		
		//Addition of the Number get Printed 20
		System.out.println("Constructor 1 :"+constructor1.balanceAmount);
		
		/** Testing constructor Behavior
		 * @param Input to the constructor having (double,String) as input parameter
		 */
		ConstructorExample constructor2=new ConstructorExample(45.45,"pawanc");
		
		//It will print 0.0 since i.e is the default value for double
		//Instance fields are initialized to a default value
		System.out.println("Constructor 2 :"+constructor2.balanceAmount);
	}

}
