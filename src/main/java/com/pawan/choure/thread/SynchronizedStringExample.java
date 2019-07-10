package com.pawan.choure.thread;

public class SynchronizedStringExample extends Thread{

	public static void main(String[] args) {
		Thread myThread1 = new SynchronizedStringExample();
		myThread1.start();
		Thread myThread2 = new SynchronizedStringExample();
		myThread2.start();

	}

	public void run(){
		String inputString= new String("Pawan");
		System.out.println("Thread Name :"+Thread.currentThread().getName());
		voidAccessString(inputString,Thread.currentThread().getName());
	}

	private void voidAccessString(String inputString,String threadName) {
		System.out.println("Thread Name"+ threadName +"before Sync Block");
		synchronized (inputString) {
			System.out.println("Thread Name"+ threadName +"in Sync Block");
		}
		System.out.println("Thread Name"+ threadName +"after Sync Block");
	}
}

