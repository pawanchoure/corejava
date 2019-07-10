package com.pawan.choure.collections.linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {

	/**
	 * A Program that test LinkedList class
	 */
	public static void main(String[] args) {
		LinkedList<String> staff=new LinkedList<String>();
		
		//Adding element to the Last position Linked List
		
		staff.addLast("Pawan");
		staff.addLast("Sachin");
		staff.addLast("Ketan");
		staff.addLast("Adarsh");
		
		
		//Iterating the LinkedList
		ListIterator<String> iterator=staff.listIterator(); //|PSKA
		
		if(iterator.hasNext())
			iterator.next(); // P|SKA
		
		if(iterator.hasNext())
		iterator.next();  // PS|KA

		//PS|KA
		iterator.add("Rajender"); //PS|KAR
		iterator.add("Prashant");  //PS|KARP
		
		iterator.next();
		
		//Remove the Last Traversed Element 
		iterator.remove();  //Remove Ketan
		
		
		//Printing all the Elements
/*		while(iterator.hasNext())
		{
			System.out.print(iterator.next());
		}*/
		
		for(String s:staff)
		{
			System.out.println(s);
		}
		

	}

}
