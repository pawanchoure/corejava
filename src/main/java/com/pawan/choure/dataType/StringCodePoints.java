package com.pawan.choure.dataType;

/**
 * Created by Pawan on 07-06-2019.
 */
public class StringCodePoints {

    public static void main(String[] args) {

        String greeting = "Hello";
        int n = greeting.length();
        System.out.println("String Length"+n);

        int cpcount = greeting.codePointCount(0, greeting.length());
        System.out.println("String Code Points :"+cpcount);


        //String to Code Point Array
        int[] codePoints = greeting.codePoints().toArray();
        String str = new String(codePoints, 0, codePoints.length);
        System.out.println(str);

    }
}
