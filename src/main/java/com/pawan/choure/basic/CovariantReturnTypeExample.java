package com.pawan.choure.basic;

public class CovariantReturnTypeExample {

	public static void main(String[] args) {
		Circle1 c1 = new Circle1(10, 20, 30);
		Shape4 s1 = new Circle1(10, 20, 30);
		
		Circle1 c2 = c1.copyCovariant();
		Shape4 s2 = c1.copy();

	}

}

abstract class Shape4 {
	// other methods...
	public abstract Shape4 copy();
	public abstract Shape4 copyCovariant();
}

class Circle1 extends Shape4 {
	// other methods...
	public Circle1(int x, int y, int radius) { /* initialize fields here */
	}

	public Shape4 copy() {
		return null; /* return a copy of this object */
	}
	
	public Circle1 copyCovariant() {
		return null; /* return a copy of this object */
	}
}
