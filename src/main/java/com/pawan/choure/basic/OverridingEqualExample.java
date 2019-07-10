package com.pawan.choure.basic;

public class OverridingEqualExample {

	public static void main(String[] args) {
		// Derived Reference
		Point p1 = new Point(10, 20);
		Point p2 = new Point(50, 100);
		Point p3 = new Point(10, 20);
		// Equality works fine
		System.out.println("p1 equals p2 is " + p1.equals(p2));
		System.out.println("p1 equals p3 is " + p1.equals(p3));

		// Base Reference
		Object o1 = new Point(10, 20);
		Object o2 = new Point(50, 100);
		Object o3 = new Point(10, 20);
		// Equality will not work
		System.out.println("o1 equals o2 is " + o1.equals(o2));
		System.out.println("o1 equals o3 is " + o1.equals(o3));
	}

}

class Point {
	private int xPos, yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	// override the equals method to perform
	// "deep" comparison of two Point objects
	public boolean equals(Point other) {
		if (other == null)
			return false;
		// two points are equal only if their x and y positions are equal
		if ((xPos == other.xPos) && (yPos == other.yPos))
			return true;
		else
			return false;
	}

	@Override
	public boolean equals(Object other) {
		if (other == null)
			return false;
		// check if the dynamic type of 'other' is Point
		// if 'other' is of any other type than 'Point', the two objects cannot
		// be
		// equal if 'other' is of type Point (or one of its derived classes),
		// then
		// downcast the object to Point type and then compare members for
		// equality
		if (other instanceof Point) {
			Point anotherPoint = (Point) other;
			// two points are equal only if their x and y positions are equal
			if ((xPos == anotherPoint.xPos) && (yPos == anotherPoint.yPos))
				return true;
		}
		return false;
	}
}
