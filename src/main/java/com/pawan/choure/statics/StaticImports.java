package com.pawan.choure.statics;
import static java.lang.Math.*;
import static java.lang.System.*;


public class StaticImports {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		double r=sqrt(PI); //Instead of Math.sqrt(Math.PI)
		out.println(r);    //Instead of System.out
	}

}
