package com.pawan.choure.dataType;

public class StringConcatenation {
    public static void main(String[] args){

        //With + Operator
        String fullName="Pawan "+"Datta"+"Choure";
        String fullName2=String.join(" ","Pawan","Datta","Choure");
        System.out.println("Full Name with +"+fullName);
        System.out.println("Full Name String Join "+fullName2);
    }
}
