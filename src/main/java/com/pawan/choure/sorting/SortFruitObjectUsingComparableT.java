package com.pawan.choure.sorting;

import java.util.Arrays;

public class SortFruitObjectUsingComparableT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fruit2[] fruits = new Fruit2[4];
		 
		Fruit2 pineappale = new Fruit2("Pineapple", "Pineapple description",70); 
		Fruit2 apple = new Fruit2("Apple", "Apple description",100); 
		Fruit2 orange = new Fruit2("Orange", "Orange description",80); 
		Fruit2 banana = new Fruit2("Banana", "Banana description",90); 
 
		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;
 
		Arrays.sort(fruits);
 
		int i=0;
		for(Fruit2 temp: fruits){
		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() + 
			", Quantity : " + temp.getQuantity());
		}

	}

}
