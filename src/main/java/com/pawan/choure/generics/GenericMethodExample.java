package com.pawan.choure.generics;

import java.util.ArrayList;
import java.util.Collection;

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
