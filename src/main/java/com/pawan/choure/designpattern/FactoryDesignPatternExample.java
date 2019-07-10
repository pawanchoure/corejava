package com.pawan.choure.designpattern;/*
package com.pawanchoure.designpattern;

import java.util.ArrayList;
import java.util.Iterator;

public class FactoryDesignPatternExample {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		canvas.addNewShape("Circle");
		canvas.addNewShape("Rectangle");
		canvas.redraw();

	}

}

// Shape.java
interface Shape {
	public void draw();

	public void fillColor();
}

// Circle.java
class Circle implements Shape {
	private int xPos, yPos;
	private int radius;

	public Circle(int x, int y, int r) {
		xPos = x;
		yPos = y;
		radius = r;
		System.out.println("Circle constructor");
	}

	@Override
	public void draw() {
		System.out.println("Circle draw()");
		// draw() implementation
	}

	@Override
	public void fillColor() {
		// fillColor() implementation
	}
}

// Rectangle.java
class Rectangle implements Shape {
	public Rectangle(int length, int height) {
		this.length = length;
		this.height = height;
		System.out.println("Rectangle constructor");
	}

	private int length, height;

	@Override
	public void draw() {
		System.out.println("Rectangle draw()");
		// draw() implementation
	}

	@Override
	public void fillColor() {
		// fillColor() implementation
	}
}

// ShapeFactory.java
class ShapeFactory {
	public static Shape getShape(String sourceType) {
		switch (sourceType) {
		case "Circle":
			return new Circle(10, 10, 20);
		case "Rectangle":
			return new Rectangle(10, 20);
		}
		return null;
	}
}

class Canvas {
	private ArrayList<Shape> shapeList = new ArrayList<Shape>();

	public void addNewShape(String shapeType) {
		Shape shape = ShapeFactory.getShape(shapeType);
		shapeList.add(shape);
	}

	public void redraw() {
		Iterator<Shape> itr = shapeList.iterator();
		while (itr.hasNext()) {
			Shape shape = itr.next();
			shape.draw();
		}
	}
}*/
