package com.pawan.choure.variable;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        String  a="{]";
       // a = in.next();

/// { [  ()
        boolean res  = isValid(a);
        System.out.println("Is valid  : " + res);
    }

    public static boolean isValid(String s) {
        int len = s.length();

        Deque<Character> deq = new ArrayDeque<>();

        for(int i = 0 ; i < len;i ++){
            Character c = s.charAt(i);

            if(c == '{' || c == '(' || c == '[' ){
                System.out.println("Incoming char : " + c);

                deq.push(c);continue;
            }

            if(deq.isEmpty()){
                return false;
            }
            char checkChar;
            switch(c) {
                case '}' :
                    checkChar = deq.pop();
                    System.out.println(" Check char : " + checkChar);

                    if(checkChar == '(' || checkChar == '['){
                        return false;
                    }
                    break;
                case ']' :
                    checkChar = deq.pop();
                    System.out.println(" Check char : " + checkChar);

                    if(checkChar == '{' || checkChar == '(') {
                        return false;
                    }
                    break;
                case ')' :
                    checkChar = deq.pop();
                    System.out.println(" Check char : " + checkChar);

                    if(checkChar == '[' || checkChar == '{'){
                        return false;
                    }
                    break;
            }
        }
        return deq.isEmpty();
    }
}
