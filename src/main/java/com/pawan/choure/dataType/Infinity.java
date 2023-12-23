package com.pawan.choure.dataType;

/**
 * Infinity : Class to check the Infinity
 *  There are 3 special floating point values to denote overflows and errors
 *  1) Positive infinity --Dividing Positive Number by Zero
 *  2) Negative Infinity
 *  3)NaN(Not a Number) --Dividing 0/0 or square root of negative number
 */
public class Infinity {

    public static void main(String[] args){
        //Divide by Zero
        double inf = Double.POSITIVE_INFINITY;
        System.out.println(inf + 5);
        System.out.println(inf - inf); // same as Double.NaN
        System.out.println(inf * -1); // same as Double.NEGATIVE_INFINITY

        //Dividing Positive Number by Zero
        if(1d/0.0d==Double.POSITIVE_INFINITY){
            System.out.println("POSITIVE");
        }

        //Multiply Positive Infinity by Negative will make Negative Infinity
        if(inf * -1==Double.NEGATIVE_INFINITY){
            System.out.println("NEGATIVE");
        }

        //Dividing Zero by Zero or Square Root of Negative Number will yield Nan
        System.out.println(Math.sqrt(0.0/0.0d));
        if(0.0/0.0d==Double.NaN){
            System.out.println("NAN");
        }

        Double dbl= new Double(-45.0d);
        System.out.println(Math.sqrt(dbl));

        if(Math.sqrt(dbl)==Double.NaN){
            System.out.println("NAN");
        }

    }
}
