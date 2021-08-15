package com.pawan.choure.collections.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args){
        //Soring for Primitive Data Types
        int[] number= new int[]{2,3,3,4,5,3,1};
         Arrays.sort(number); // Its a tuned version of quicksort algorithm It will sort in Ascending Order for Desc there is no support
        System.out.println("Sorted in ASC Order");
        System.out.println(Arrays.toString(number));
        reverse(number);    //Custom Reverse Function to be written
        System.out.println("Sorted in DESC Order");
        System.out.println(Arrays.toString(number));


        //Sorting Integer Object
        Integer[] numberObjects= new Integer[]{2,3,3,4,5,3,1};
        Arrays.sort(numberObjects); // Its a tuned version of quicksort algorithm It will sort in Ascending Order for Desc there is no support
        System.out.println("Sorted in ASC Order");
        System.out.println( Arrays.toString(numberObjects));
        Arrays.sort(numberObjects,Collections.reverseOrder());
        System.out.println("Sorted in DESC Order");
        System.out.println( Arrays.toString(numberObjects));


        //Sorting for String Objects
        String[] names= {"Pawan","Ketan","Amit","Ziva"};
        Arrays.sort(names); //Sorting in ASC Order
        System.out.println("Sorted in ASC Order");
        ;
        System.out.println(Arrays.toString(names));
        Arrays.sort(names, Collections.reverseOrder());
        System.out.println("Sorted in DESC Order");
        System.out.println(Arrays.toString(names));
    }

    /**
     * Java Method to reverse String array in place
     *
     * @param array
     */
    public static void reverse(int[] array) {

        if (array == null || array.length < 2) {
            return;
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

    }
}
