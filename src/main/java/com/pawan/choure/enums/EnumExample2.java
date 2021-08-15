package com.pawan.choure.enums;

import java.util.Scanner;

public class EnumExample2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size=" + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job--you paid attention to the _.");
    }
}

enum Size{
    SMALL("S"),MEDIUM("M"),LARGE("L"),EXTRA_LARGE("XL");
    private String abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}


enum Band{
    ASSOCIATE(100),AVP(101),VP(102),DIRECTOR(103);

    private int band;

    private Band(int band) {
        this.band = band;
    }

  public static Band getBand(int band){
        Band[] bands=Band.values();
        for(Band b: bands){
            if(b.band==band){
                return b;
            }
        }
        return null;
  }
}
