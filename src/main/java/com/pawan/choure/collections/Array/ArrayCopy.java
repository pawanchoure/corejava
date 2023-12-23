package com.pawan.choure.collections.Array;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args){
        int[] number= new int[]{2,3,3,4};
        System.out.println("Number Length "+number.length);
        int[] numberCopy=number;
        int[] numberCopyUsingArrays=Arrays.copyOf(number,number.length*2);  //new Length is commonly used to increase the array size and new block are filled with default values

        //Now number and numberCopy point to same list
        number[0]=10;  //Now numberCopy[0] is also 10
        //number[4]=100;

        System.out.println("Number Length "+number.length);
        System.out.println("numberCopy Length "+numberCopy.length);
        System.out.println("numberCopyUsingArrays Length "+numberCopyUsingArrays.length);

    }
}
