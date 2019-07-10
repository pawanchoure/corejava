package com.pawan.choure.dataType;

/**
 * Created by Pawan on 07-06-2019.
 */
public class Arithmetic {

    public static void main(String[] args){
        int x=3;
        System.out.println(3f+3.5d);

        //PostFix PreFix
        int m=7;
        int n=7;
        int a=2*++m;
        int b=2*n++;
        System.out.println("Prefix : " +a);
        System.out.println("Prefix : " +b);
    }
}
