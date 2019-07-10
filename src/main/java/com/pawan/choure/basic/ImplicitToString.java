package com.pawan.choure.basic;

public class ImplicitToString {
	public static void main(String[] args) {
		// implicitly invoke toString method
		System.out.println(new Color());
	}

}

class Color {
	int red, green, blue;

	Color() {
		this(10, 10, 10);
	}

	Color(int r, int g, int b) {
		red = r;
		green = g;
		blue = b;
	}

	public String toString() {
		return "The color is: " + " red = " + red + " green = " + green
				+ " blue = " + blue;
	}
}
