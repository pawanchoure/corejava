package com.pawan.choure.basic;

/**
 * @author Pawan
 *
 */
public class MathFunctions {

	public static void main(String[] args) {
		double floatNumber1=10.75;
		double floatNumber2=10.25;

		System.out.println("Round Function");
		System.out.println("Round  of " + floatNumber1+ " is " + +Math.round(floatNumber1) );
		System.out.println("Round  of " + floatNumber2+ " is " + +Math.round(floatNumber2) );
	
		System.out.println("Floor Function");
		System.out.println("Floor  of " + floatNumber1+ " is " + +Math.floor(floatNumber1) );
		System.out.println("Floor  of " + floatNumber2+ " is " + +Math.floor(floatNumber2) );
		
		System.out.println("Ceil Function");
		System.out.println("Ceil  of " + floatNumber1+ " is " + +Math.ceil(floatNumber1) );
		System.out.println("Ceil  of " + floatNumber2+ " is " + +Math.ceil(floatNumber2) );
	}

}
