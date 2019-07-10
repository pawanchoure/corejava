package com.pawan.choure.collections;

import java.util.Arrays;

public class ArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Array Declaration
		double[] data= new double[2];
		double data1[]=new double[2];
		
		double data2[]={1,2};
		
		data[0]=1;
		data[1]=2;
		
		data1[0]=2;
		data1[1]=1;
		
		Arrays.sort(data);
		
		//Sorted Data
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
		
		//UnSorted Data
		for(int j=0;j<data1.length;j++)
		{
			System.out.println(data1[j]);
		}
		
		//UnSorted Data
		for(int k=0;k<data2.length;k++)
		{
			System.out.println(data2[k]);
		}
		
		/*
		 * Output
		 * 	1.0
			2.0
			2.0
			1.0
			1.0
			2.0
		 */
		
		
		Integer[] i=new Integer[34];
		System.out.println(i[0]);
		
		/*
		 * null
		 */

		double[] c;
		/*System.out.println(c[0]);
		 *  Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			The local variable c may not have been initialized
		 */
		
		Integer[] int1=new Integer[4];
		int1[0]=4;
		int1[1]=3;
		int1[2]=1;
		int1[3]=2;
		System.out.println("Array :: int1 length :"+int1.length);
		
		System.out.println(Arrays.asList(int1));
		
	}

}
