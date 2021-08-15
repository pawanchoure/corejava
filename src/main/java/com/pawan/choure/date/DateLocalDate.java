package com.pawan.choure.date;

import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class DateLocalDate {
    public static void main(String[] args){
        Date date=new Date(); //Represent Point in Time - Not Useful for Manipulating Calender Information
        System.out.println(date.toString());

        LocalDate localDate=LocalDate.now(); // Expresses Days in Familiar Calender Notation
        System.out.println(localDate.toString());

        //Construct LocalDate from YYYY MMM & DD
        LocalDate localDateNew=LocalDate.of(2019, Month.JULY,11);
        System.out.println("Year "+localDateNew.getYear());  //2019
        System.out.println("Month in STRING :"+localDateNew.getMonth());  //JULY
        System.out.println("Month "+localDateNew.getMonthValue());  //07
        System.out.println("Day "+localDateNew.getDayOfMonth()); //11

        //Manipulate Date
        LocalDate localDateNewThousandDaysLater=localDateNew.plusDays(100);
        System.out.println("Year "+localDateNewThousandDaysLater.getYear());  //2019
        System.out.println("Month in STRING "+localDateNewThousandDaysLater.getMonth());  //October
        System.out.println("Month "+localDateNewThousandDaysLater.getMonthValue());  //10
        System.out.println("Day "+localDateNewThousandDaysLater.getDayOfMonth());  //19

    }
}
