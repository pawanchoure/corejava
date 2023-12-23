package com.pawan.choure.generics;

import java.math.BigDecimal;
import java.util.*;

public class GenericMethodExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<String> strArr=new ArrayList<String>();
		strArr.add("Pawan");
		strArr.add("Ketan");
		strArr.add("Adarsh");
		
		print(strArr);
		
		ArrayList<Double> strDouble=new ArrayList<Double>();
		strDouble.add(1d);
		strDouble.add(2d);
		strDouble.add(3d);
		
		print(strDouble);
		
		
		String a="abc";
		printObject(a);
		
		Double d=12d;
		printObject(d);
		
		int primitive=1;
		printObject(primitive);
		
		boolean value;
		Set<Integer> REPO_AGREEMENT_TYPE_ID = new HashSet<>(Arrays.asList(1,2));

		System.out.println(REPO_AGREEMENT_TYPE_ID.contains(null));

		// Creating 2 BigDecimal objects
		BigDecimal b1, b2;

		b1 = new BigDecimal(100);
		b2 = new BigDecimal(0);

		if (b1.compareTo(b2) == 0) {
			System.out.println(b1 + " and " + b2 + " are equal.");
		}
		else if (b1.compareTo(b2) == 1) {
			System.out.println(b1 + " is greater than " + b2 + ".");
		}
		else {
			System.out.println(b1 + " is lesser than " + b2 + ".");
		}

		if (b2.compareTo(b1) == 0) {
			System.out.println(b1 + " and " + b2 + " are equal.");
		}
		else if (b1.compareTo(b2) == 1) {
			System.out.println(b1 + " is greater than " + b2 + ".");
		}
		else {
			System.out.println(b1 + " is lesser than " + b2 + ".");
		}

	}

	private static Boolean geval() {
		return null;
	}

	/**
	 * Generic Method to iterate Collection<T>
	 * @param collection
	 */
	
	public static <T> void print(Collection<T> collection)
	{
		for(T e : collection)
		{
			System.out.println(e + " ");
		}
	}
	
	
	/**
	 * Generic Method to Print Object
	 * @param collection
	 */
	public static <Object> void printObject(Object o)
	{
			System.out.println(o + " ");
		
	}
	

}
