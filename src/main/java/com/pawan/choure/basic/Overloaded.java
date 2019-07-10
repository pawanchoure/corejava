package com.pawan.choure.basic;

public class Overloaded {
	public static void aMethod(int val) {
		System.out.println("int");
	}

	public static void aMethod(short val) {
		System.out.println("short");
	}

	public static void aMethod(Object val) {
		System.out.println("object");
	}

	public static void aMethod(String val) {
		System.out.println("String");
	}

	public static void aMethod(long val1, int val2) {
		System.out.println("long, int");
	}

	public static void aMethod(int val1, long val2) {
		System.out.println("int, long");
	}
	
	public static void aMethod(double val1, float val2) {
		System.out.println("double, float");
	}

	public static void aMethod(float val1, double val2) {
		System.out.println("float, double");
	}
	
	public static void aMethod(float val1, float val2) {
		System.out.println("float, double");
	}


	public static void main(String[] args) {
		byte b = 9;
		aMethod(b); // first call
		aMethod(9); // second call
		Integer i = 9;
		aMethod(i); // third call
		aMethod("9"); // fourth call

		// No Extract Match but two matched while upcasting
		// aMethod(9, 10); --Compile time error
		
		aMethod(1.0f,2.0f);
	
		
	}

}

/*
 * Output short int object String
 */