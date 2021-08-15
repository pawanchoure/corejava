package com.pawan.choure.dataType;

/**
 * Arithmetic : Check Arithmetic Operations
 */
public class Arithmetic {

    public static void main(String[] args){

        //Adding Float with double
        System.out.println(3f+3.5d);

        //PostFix PreFix
        int m=7;
        int n=7;
        int a=2*++m;   //Now a is 16,m is 8
        int b=2*n++;   //Now a is 14,m is 8
        System.out.println("Prefix : " +a);
        System.out.println("PostFix : " +b);
    }
}
