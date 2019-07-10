package com.pawan.choure.variable;

public class Increment {

	public static void main(String[] args) {
		int a=6,b=7;
		int x;
		int aval=++a;
		System.out.println(aval);
		int bval=b++;
        System.out.println(bval);
		x=++a + b++;
		System.out.println("x :"+x + " a :"+a + " b:"+ ++b);
	}

}
