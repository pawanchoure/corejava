package com.pawan.choure.designpattern;/*package com.pawanchoure.designpattern;

import java.util.Observable;
import java.util.Observer;

public class ObservableDesignPatternExample {

	public static void main(String[] args) {
		Circle circle = new Circle(10, 10, 20);
		System.out.println(circle);
		circle.addObserver(new Canvas());
		circle.addObserver(new ShapeArchiver());
		circle.setRadius(50);
		System.out.println(circle);

	}

}

class Circle extends Observable {
	private Point center;
	private int radius;

	public void setCenter(Point center) {
		this.center = center;
		setChanged();
		notifyObservers();
	}

	public void setRadius(int radius) {
		this.radius = radius;
		setChanged();
		notifyObservers();
	}

	public Circle(int x, int y, int r) {
		center = new Point(x, y);
		radius = r;
	}

	public String toString() {
		return "center = " + center + " and radius = " + radius;
	}
}

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

class Canvas implements Observer {
	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("Canvas::update");
		// actual update code elided ...
	}
}

class ShapeArchiver implements Observer {
	@Override
	public void update(Observable arg0, Object arg1) {
		System.out.println("ShapeArchiver::update");
		// actual update code elided ...
	}
}*/