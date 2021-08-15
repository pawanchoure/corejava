package com.pawan.choure.inputoutput;

import java.util.Scanner;

/**
 * Scanner Basic Example
 */
public class ScannerExample {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("What is your name");
        String name=in.nextLine();  //Read Entire Line
        System.out.println("name is :"+name);
        System.out.println("What is your Address");
        String address=in.next();   //Read Single Word Delimited by whitespace
        System.out.println("address is :"+address);
        System.out.println("What is your Age");
        Integer age=in.nextInt();
        System.out.println("Age is :"+age);
        in.close();
    }
}
