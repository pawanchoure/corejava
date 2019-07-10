package com.pawan.choure.mainMethod;

/**
 * Created by Pawan on 6/3/2016.
 */
public class OverloadedMain {

    static public void main(String[] args)
    {
        System.out.println("Hello World");
        Integer[] integers= new Integer[2];
        integers[0]=1;
        integers[1]=2;
        main(integers);
    }


     static void main(Integer[] args)
    {
        System.out.println("Hello World Integer");
    }
}
