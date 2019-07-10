package com.pawan.choure.basic;

import java.util.Scanner;

public class StringTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String original, reverse = ""; Scanner in = new Scanner(System.in);
		 * 
		 * System.out.println("Enter a string to reverse"); original =
		 * in.nextLine();
		 * 
		 * int length = original.length();
		 * 
		 * for ( int i = length - 1 ; i >= 0 ; i-- ) reverse = reverse +
		 * original.charAt(i);
		 * 
		 * System.out.println("Reverse of entered string is: "+reverse); }
		 */

		String str, sub, reverse = "";

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string to print it's all substrings");
		str = in.nextLine();

		int length = str.length();

		for (int a = length - 1; a >= 0; a--)

			reverse = reverse + str.charAt(a);
		System.out.println("Reverse is " + reverse);

		System.out.println("Substrings of \"" + str + "\" are :-");

		for (int c = 0; c < length; c++) {
			for (int i = 1; i <= length - c; i++) {

				sub = str.substring(c, c + i);// start 4m c to c+i

				System.out.println(sub);
			}
		}
	}

}
