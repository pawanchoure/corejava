package com.pawan.choure.sorting;

public class Fruit2 implements Comparable<Fruit2>{
	private String fruitName;
	private String fruitDesc;
	private int quantity;
 
	public Fruit2(String fruitName, String fruitDesc, int quantity) {
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
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


	public int compareTo(Fruit2 other) {
		
		 if(this.quantity <other.quantity)
			 return -1;
		 if(this.quantity >other.quantity)
			 return 1;
		 if(this.quantity == other.quantity)
			 return 0;
		 return 0;
		 
			//ascending order
			//return this.quantity - compareQuantity;
	 
			//descending order
			//return compareQuantity - this.quantity;

	}

}
