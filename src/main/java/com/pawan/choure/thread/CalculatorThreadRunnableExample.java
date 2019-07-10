package com.pawan.choure.thread;

public class CalculatorThreadRunnableExample implements Runnable{
	
	private int number;
	
	public CalculatorThreadRunnableExample(int number) {
	this.number=number;
	}
	@Override
	public void run(){
		for (int j=0;j<10;j++){
			System.out.printf("%s: %d * %d = %d\n",Thread.currentThread().getName(),number,j,j*number);
		}
	}

	public static void main(String[] args) {
		
		for (int i=0;i<10;i++){
			Thread calRunnable=new Thread(new CalculatorThreadRunnableExample(i));
			calRunnable.start();
			
		}
	}

}
