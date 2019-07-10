package com.pawan.choure.collections;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalenderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GregorianCalendar cal =new GregorianCalendar(TimeZone.getTimeZone("America/New_York"));
		System.out.println("Year :"+ cal.get(cal.YEAR));
		System.out.println("Month :"+ cal.get(cal.MONTH));
		System.out.println("Day :"+ cal.get(cal.DATE));

		System.out.println("Hour :"+ cal.get(cal.HOUR));
		System.out.println("Minutes :"+ cal.get(cal.MINUTE));
		System.out.println("Second :"+ cal.get(cal.SECOND));
		System.out.println("AM/PM :"+ cal.get(cal.AM_PM));
		
		System.out.println("Time"+cal.getInstance(TimeZone.getTimeZone("America/New_York")).getTimeInMillis());
		System.out.println("Time"+cal.getInstance(TimeZone.getDefault()).getTimeInMillis());
		//java.sql.Date date = new java.sql.Date(cal.getTimeInMillis());
		Date dt=new Date(cal.get(cal.YEAR),cal.get(cal.MONTH), cal.get(cal.DATE),cal.get(cal.HOUR), cal.get(cal.MINUTE), cal.get(cal.SECOND)); 
		System.out.println(dt);
		
		
		Date date = new Date();

		TimeZone brusselsTZ = TimeZone.getTimeZone("Europe/Brussels");
		TimeZone newYorkTZ = TimeZone.getTimeZone("America/New_York");
		//TimeZone indiaTZ = TimeZone.getTimeZone("GMT+5:30");
		TimeZone indiaTZ = TimeZone.getTimeZone("Asia/Calcutta");
		
		SimpleDateFormat formatterNY = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		SimpleDateFormat formatterBR = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		SimpleDateFormat formatterKO = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		
		formatterNY.setTimeZone(newYorkTZ);
		formatterBR.setTimeZone(brusselsTZ);
		formatterKO.setTimeZone(indiaTZ);

		System.out.print("New York: ");
		System.out.println(formatterNY.format(date));
		//New York: 1970-01-23 19:00:00.000
		System.out.print("Brussels: ");
		System.out.println(formatterBR.format(date));
		
		System.out.print("Kolkatta: ");
		System.out.println(formatterKO.format(date));
		
		String[] tzNames = TimeZone.getAvailableIDs();
		System.out.print(tzNames.toString());
		 
	}

}
