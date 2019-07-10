package com.pawan.choure.nestedclass;

public class StaticNestedInnerClassInsideInterfaceExample {

	public static void main(String[] args) {
		
		Outer.Inner white = new Outer.Inner(255, 255, 255);
		System.out.println("White color has values:" + white);

	}

}

interface Outer{
	static class Inner {
		int m_red, m_green, m_blue;

		public Inner() {
			// call the other overloaded Color constructor by passing default
			// values
			this(0, 0, 0);
		}

		public Inner(int red, int green, int blue) {
			m_red = red;
			m_green = green;
			m_blue = blue;
		}

		public String toString() {
			return " red = " + m_red + " green = " + m_green + " blue = "
					+ m_blue;
		}
		
	}
}
