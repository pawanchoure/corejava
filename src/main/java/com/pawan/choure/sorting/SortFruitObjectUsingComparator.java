package com.pawan.choure.sorting;

import java.util.Arrays;

public class SortFruitObjectUsingComparator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fruit3[] fruits = new Fruit3[4];
		 
		Fruit3 pineappale = new Fruit3("Pineapple", "Pineapple description",70); 
		Fruit3 apple = new Fruit3("Apple", "Apple description",100); 
		Fruit3 orange = new Fruit3("Orange", "Orange description",80); 
		Fruit3 banana = new Fruit3("Banana", "Banana description",90); 
 
		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;
 
		Arrays.sort(fruits, Fruit3.FruitNameComparator);

 
		int i=0;
		for(Fruit3 temp: fruits){
		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() + 
			", Quantity : " + temp.getQuantity());
		}
	

	}

}
