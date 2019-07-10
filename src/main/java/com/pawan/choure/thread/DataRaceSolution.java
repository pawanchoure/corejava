package com.pawan.choure.thread;

//This class exposes a publicly accessible counter
//to help demonstrate data race problem
class Counter1 {
	public static long count = 0;
}

// This class implements Runnable interface
// Its run method increments the counter three times
class UseCounter1 implements Runnable {
	public void increment() {
		// increments the counter and prints the value
		// of the counter shared between threads
		synchronized (this) {
			Counter.count++;
			System.out.print(Counter.count + " ");
		}
	
	}

	public void run() {
		increment();
		increment();
		increment();
	}
}

public class DataRaceSolution {
	public static void main(String args[]) {
		UseCounter1 c = new UseCounter1();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		t1.start();
		t2.start();
		t3.start();
	}
}
