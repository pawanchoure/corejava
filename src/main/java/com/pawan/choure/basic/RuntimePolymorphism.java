package com.pawan.choure.basic;

public class RuntimePolymorphism {
	public static void main(String[] args) {
		Shape shape1 = new Circle(10);
		System.out.println("Area  : "+shape1.area()+"  Circumference : "+shape1.circumference()+"  Daimeter : "+shape1.diameter());
		Shape shape2 = new Square(10);
		System.out.println(shape2.area());
	}

}

// Shape.java
class Shape {
	public double area() {
		return 0;
	} 
	
	protected double circumference(){
		return 0;
		// default implementation
	}
	// other members
	protected float diameter(){
		return 0;
		// default implementation
	}
}

// Circle.java
class Circle extends Shape {
	private int radius;

	public Circle(int r) {
		radius = r;
	}

	// other constructors
	public double area() {
		return Math.PI * radius * radius;
	}
	// other declarations
	public double circumference(){
		return 2*Math.PI*radius;
	}
	protected float diameter(){
		return 2*radius;
	}
}

// Square.java
class Square extends Shape {
	private int side;

	public Square(int a) {
		side = a;
	}

	public double area() {
		return side * side;
	}
	// other declarations
}
