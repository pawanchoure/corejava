package com.pawan.choure.thread;

public class ThreadStateProblem_IllegalThreadStateException  {

	public static void main(String[] args) {
		Thread t1= new Thread();
		Thread t2= new Thread();
		t1.start();
		t2.start();
		t1.start();
	}

}
