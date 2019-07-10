package com.pawan.choure.designpattern;/*package com.pawanchoure.designpattern;

public class NoDesignPatternExample {

	public static void main(String[] args) {
		Circle circle = new Circle(10, 10, 20);
		System.out.println(circle);
		circle.setCanvas(new Canvas());
		circle.setShapeArchiver(new ShapeArchiver());
		circle.setRadius(50);
		System.out.println(circle);

	}

}

// Circle class "informs" (i.e., "notifies") Canvas and ShapeArchiver whenever
// it gets "changed"
// by calling the update method of these two classes
class Circle {
	private Point center;
	private ShapeArchiver shapeArchiver;
	protected Canvas canvas;
	private int radius;
	
	public void setCenter(Point center) {
		this.center = center;
		canvas.update(this);
		shapeArchiver.update(this);
	}

	public void setRadius(int radius) {
		this.radius = radius;
		canvas.update(this);
		shapeArchiver.update(this);
	}

	public void setShapeArchiver(ShapeArchiver shapeArchiver) {
		this.shapeArchiver = shapeArchiver;
	}

	public void setCanvas(Canvas canvas) {
		this.canvas = canvas;
	}

	public Circle(int x, int y, int r) {
		center = new Point(x, y);
		radius = r;
	}

	public String toString() {
		return "center = " + center + " and radius = " + radius;
	}
}

// Point.java
class Point {
	private int xPos;
	private int yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public String toString() {
		return "(" + xPos + "," + yPos + ")";
	}
}

// ShapeArchiver.java
class ShapeArchiver {
	public void update(Circle circle) {
		System.out.println("ShapeArchiver::update");
		// update implementation
	}
}

// Canvas.java
class Canvas {
	public void update(Circle circle) {
		System.out.println("Canvas::update");
		// update implementation
	}
}*/