package com.pawan.choure.streams;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.IntStream;

public class FirstDuplicate {
    public static void main(String[] args) throws IOException {

        System.out.println(firstDuplicate(new int[]{2, 1, 3, 5, 3, 2}));
    }

    static int firstDuplicate(int[] a) {
        int result=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]);
            if(set.contains(a[i])){
                 return result=i;
            }else{
                set.add(a[i]);
            }
        }

        return result;

    }

}
