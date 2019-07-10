package com.pawan.choure.dataType;

/**
 * Created by Pawan on 07-06-2019.
 */
public class Infinity {

    public static void main(String[] args){
        //Divide by Zero
        double inf = Double.POSITIVE_INFINITY;
        System.out.println(inf + 5);
        System.out.println(inf - inf); // same as Double.NaN
        System.out.println(inf * -1); // same as Double.NEGATIVE_INFINITY


        if(1d/0.0d==Double.POSITIVE_INFINITY){
            System.out.println("POSITIVE");
        }
        if(inf * -1==Double.NEGATIVE_INFINITY){
            System.out.println("NEGATIVE");
        }
        if(1d/0.0d==Double.NaN){
            System.out.println("NAN");
        }

    }
}
