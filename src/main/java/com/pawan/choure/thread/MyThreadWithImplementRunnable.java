package com.pawan.choure.thread;

public class MyThreadWithImplementRunnable implements Runnable {

	public void run() {
		System.out.println("In run method; thread name is: "
				+ Thread.currentThread().getName());
	}

	public static void main(String args[]) {
		Thread myThread = new Thread(new MyThreadWithImplementRunnable());
		myThread.start();
		System.out.println("In main method; thread name is: "
				+ Thread.currentThread().getName());
	}
}
