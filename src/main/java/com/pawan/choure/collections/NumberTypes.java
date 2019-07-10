package com.pawan.choure.collections;

public class NumberTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        /*
         * float is 32 bit single precision type and used when fractional precision
         * calculation is required.
         *
         * Declare float varibale as below
         *
         * float <variable name> = <default value>;
         *
         * here assigning default value is optional.
         */

		/* It will accept value till 7 decimal precision
		 *	i.e 7 digit after . 
		 * 	it will round the digit after that
		 */
        float f1 = 12.1234567f;
        System.out.println("Value of float variable f1 is :" + f1);
        
        /*
         * Double Example
         */
        
		/* It will accept value till 15 decimal precision
		 *	i.e 7 digit after . 
		 * 	it will round the digit after that
		 */
        double d=1.123456789012345;
        System.out.println("Value of double variable d is :" + d);
        
        System.out.println(Integer.valueOf("AB", 32));
		

	}

}
