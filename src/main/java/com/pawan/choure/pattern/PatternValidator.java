package com.pawan.choure.pattern;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class PatternValidator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Matcher matcher;
		final Pattern userNamePattern = Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[@#$%]).{6,20})");
		String pass="-12";
		if(userNamePattern.matcher(pass).matches()==true)
		{
			System.out.println("Valid Password");
		}
		else
		{
			System.out.println("InValid Password");	
		}
	}

}
