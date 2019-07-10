package com.pawan.choure.sorting;

import java.util.Comparator;

public class Fruit4 implements Comparator<Fruit4>{
	private String fruitName;
	private String fruitDesc;
	private int quantity;
 
	public Fruit4(String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}
 
	public Fruit4() {
		// TODO Auto-generated constructor stub
	}

	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
 

	public int compare(Fruit4 fruit1, Fruit4 fruit2) {
	      int fruitDesc1 = fruit1.getQuantity();
	      int fruitDesc2 = fruit2.getQuantity();

			 if(fruitDesc1 <fruitDesc2)
				 return -1;
			 if(fruitDesc1 >fruitDesc2)
				 return 1;
			 if(fruitDesc1 == fruitDesc2)
				 return 0;
			return 1;
			 
	}



}
