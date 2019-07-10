package com.pawan.choure.collections;

import java.util.ArrayList;

public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 /*ArrayList<int> intList=new ArrayList<int>();*/

		 
		/*
		 * Wont Work since ArrayList works only on Object use Integer instead of
		 * int
		 * 
		 * Error:Syntax error on token "int", Dimensions expected after this token
		 */

		 ArrayList<String> StringList=new ArrayList<String>();
		 
		 StringList.add("Pawan");
		 StringList.add("Sachin");
		 System.out.println("ArrayList :: StringList Size "+StringList.size());
		 
		/*
		 * Copying Arrays
		 */

		double[] d = new double[3];

		/*
		 * e hold the reference
		 */
		double[] e = d;

		/*
		 * To Copy elements use clone
		 */
		
		double[] c= (double[])d.clone();
		
		/*
		 * System.arraycopy
		 */

	}

}
