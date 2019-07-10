package com.pawan.choure.thread;

public class ThreadJoin extends Thread {
	String[] timeStr = { "Zero", "One", "Two", "Three", "Four", "Five", "Six",
			"Seven", "Eight", "Nine" };

	public static void main(String[] args) {
		Thread myThread = new ThreadJoin();
		System.out.println("Starting 10 second count down. . . ");
		myThread.start();
		try {
			myThread.join(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Boom!!!");

	}

	public void run() {
		for (int i = 9; i >= 0; i--) {
			try {
				System.out.println(timeStr[i]);
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
	}
}
