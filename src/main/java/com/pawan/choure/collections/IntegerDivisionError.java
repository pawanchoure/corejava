package com.pawan.choure.collections;

public class IntegerDivisionError {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int s1=5;
		int s2=6;
		int s3=3;
		
		//Works Fine
		int average=(s1+s2+s3)/3;
		double averagedouble=(s1+s2+s3)/3;
		
		System.out.println("Integer Average :" +average);
		System.out.println("Double Average :" +averagedouble);
		
		/*
		 * Integer Devision issue
		 * 7/10 will result in 0 so the result is 0
		 * We need to use Floating Point devision to get correct result
		 */
		System.out.println("Integer Devision=" + (1 - 7/10));
		System.out.println("Integer Devision with Floating Point=" + (1 - 7/10.0));

		/*
		 * Explicit Type Casting Required
		 */
		int result=(int) (23/2.0);
		System.out.println(result);
	}

}
