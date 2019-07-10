package com.pawan.choure.sorting;

import java.util.Comparator;

public class Fruit3 implements Comparator<Fruit3> {
	private String fruitName;
	private String fruitDesc;
	private int quantity;

	public Fruit3(String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}

	public Fruit3() {
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

	public int compare(Fruit3 fruit1, Fruit3 fruit2) {
		int fruitDesc1 = fruit1.getQuantity();
		int fruitDesc2 = fruit2.getQuantity();

		if (fruitDesc1 < fruitDesc2)
			return -1;
		if (fruitDesc1 > fruitDesc2)
			return 1;
		if (fruitDesc1 == fruitDesc2)
			return 0;
		return 1;

	}

	public static Comparator<Fruit3> FruitNameComparator = new Comparator<Fruit3>() {

		public int compare(Fruit3 fruit1, Fruit3 fruit2) {

			String fruitName1 = fruit1.getFruitName().toUpperCase();
			String fruitName2 = fruit2.getFruitName().toUpperCase();

			// ascending order
			return fruitName1.compareTo(fruitName2);

			// descending order
			// return fruitName2.compareTo(fruitName1);
		}

	};

}
