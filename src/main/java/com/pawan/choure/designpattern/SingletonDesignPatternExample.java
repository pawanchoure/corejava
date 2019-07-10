package com.pawan.choure.designpattern;

public class SingletonDesignPatternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Logger {
	// declare the constructor private to prevent clients
	// from instantiating an object of this class directly
	private Logger() {
	}

	public static Logger myInstance; // by default, this field is initialized to
										// null

	// the static method to be used by clients to get the instance of the Logger
	// class
	/*
	 * public static synchronized Logger getInstance() { if (myInstance == null)
	 * { // this is the first time this method is called, and that's why //
	 * myInstance is null myInstance = new Logger(); } // return the same object
	 * reference any time and every time getInstance // is called return
	 * myInstance; }
	 */

	public static Logger getInstance() {
		if (myInstance == null) {
			synchronized (Logger.class) {
				myInstance = new Logger();
			}
		}
		return myInstance;
	}

	public void log(String s) {
		// a trivial implementation of log where we pass the string to be logged
		// to console
		System.err.println(s);
	}
}
