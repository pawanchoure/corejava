package com.pawan.choure.sorting;

public class Fruit implements Comparable{
	private String fruitName;
	private String fruitDesc;
	private int quantity;
 
	public Fruit(String fruitName, String fruitDesc, int quantity) {
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

	public int compareTo(Object object) {
		Fruit other=(Fruit)(object);
		//For String You can use compareTo directly
		//return this.fruitName.compareTo(other.fruitName);
	
	     // For others return int
		 if(this.quantity <other.quantity)
			 return -1;
		 if(this.quantity >other.quantity)
			 return 1;
		 if(this.quantity == other.quantity)
			 return 0;
		return 1;
		 
				 
	}

}
