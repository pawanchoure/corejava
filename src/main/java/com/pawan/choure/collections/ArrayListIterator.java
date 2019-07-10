package com.pawan.choure.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
/*		ArrayList<String> arr=new ArrayList<String>();
		Iterator<String> arrItr=arr.iterator();
		arr.add("A");
		arr.add("B");
		arr.add("C");
		while(arrItr.hasNext())
		{
			System.out.println(arrItr.next());
		}*/
/*		
		 * The Program will throw following exception
		 * Exception in thread "main" java.util.ConcurrentModificationException
			at java.util.ArrayList$Itr.checkForComodification(Unknown Source)
			at java.util.ArrayList$Itr.next(Unknown Source)
			at com.pawanchoure.core.ArrayListIterator.main(ArrayListIterator.java:21)
		 
*/		
		ArrayList<String> arr1=new ArrayList<String>();
		arr1.add("A");
		arr1.add("B");
		arr1.add("C");
		Iterator<String> arrItr1=arr1.iterator();

		while(arrItr1.hasNext())
		{
			System.out.println(arrItr1.next());
		}
		

	}

}
