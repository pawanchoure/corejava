package com.pawan.choure.dataType;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Pawan on 07-06-2019.
 */
public class StringTests {

    public static void main(String[] args){

        String greeting="Hello";
        int n=greeting.length();
        System.out.println(n);

        int cpcount=greeting.codePointCount(0,greeting.length());
        System.out.println(cpcount);


        //String to Code Point Array
        int[] codePoints=greeting.codePoints().toArray();
        String str=new String(codePoints,0,codePoints.length);
        System.out.println(str);

    }
}
