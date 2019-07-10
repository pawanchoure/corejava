package com.pawan.choure.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		 
		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");
	 
		Collections.sort(fruits);
	 
		int i=0;
		for(String temp: fruits){
			System.out.println("fruits " + ++i + " : " + temp);
		}

	}

}
