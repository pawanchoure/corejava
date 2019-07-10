package com.pawan.choure.thread;
public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread() {
			public void run() {
				System.out.print("t1 ");
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				System.out.print("t2 ");
			}
		};
		t1.start();
		t1.sleep(5000);
		t2.start();
		t2.sleep(5000);
		System.out.println("main ");
	}

}
