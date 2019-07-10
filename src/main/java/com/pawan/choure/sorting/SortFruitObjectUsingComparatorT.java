package com.pawan.choure.sorting;

import java.util.Arrays;

public class SortFruitObjectUsingComparatorT {

	public static void main(String[] args) {
		Fruit4[] fruits = new Fruit4[4];
		 
		Fruit4 pineappale = new Fruit4("Pineapple", "Pineapple description",70); 
		Fruit4 apple = new Fruit4("Apple", "Apple description",100); 
		Fruit4 orange = new Fruit4("Orange", "Orange description",80); 
		Fruit4 banana = new Fruit4("Banana", "Banana description",90); 
 
		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;
 
		Arrays.sort(fruits, new Fruit4());

 
		int i=0;
		for(Fruit4 temp: fruits){
		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() + 
			", Quantity : " + temp.getQuantity());
		}
	

	}
}
