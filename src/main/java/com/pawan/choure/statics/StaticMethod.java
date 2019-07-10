package com.pawan.choure.statics;

public class StaticMethod {

	/**
	 * Static Method(Class Method) to Calculate Percent
	 * Static Method does not operate on object and they has only explicit parameters
	 * @param p
	 * @param a
	 * @return double
	 */
	public static double percentOf(double p,double a)
	{
		return (p/100)*a;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double percent=StaticMethod.percentOf(45, 100);
		System.out.println("Percent : "+percent);

	}

}
