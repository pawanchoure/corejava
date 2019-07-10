package com.pawan.choure.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysSortExample {

	public static void main(String[] args) {
		String[] stringArray = { "Pineapple", "Apple", "Orange", "Banana" };
		int[] intArray = { 4, 3, 1, 2 };

		// Ascending Order
		Arrays.sort(intArray);
		int i = 0;
		for (int temp : intArray) {
			System.out.println("Ascending Orders fruits " + ++i + " : " + temp);
		}
		
		Arrays.sort(stringArray,Collections.reverseOrder());
		int  j= 0;
		for (String temp : stringArray) {
			System.out.println("Ascending Orders fruits " + ++i + " : " + temp);
		}

	}
}
