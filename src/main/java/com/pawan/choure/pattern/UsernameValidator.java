package com.pawan.choure.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  final Pattern pattern;
		  Pattern userNamePattern = Pattern.compile("^[a-zA-Z_]{3,15}$");
		  Matcher matcher;
	 
		  final String USERNAME_PATTERN = "^[a-zA-Z0]{3,15}$";
	 
		  pattern = Pattern.compile(USERNAME_PATTERN);
		  
	 
		  /**
		   * Validate username with regular expression
		   * @param username username for validation
		   * @return true valid username, false invalid username
		   */

	 
		  //matcher = pattern.matcher("Pawan").matches();
		  boolean val=pattern.matcher("Maharashtra").matches();
		  System.out.println(val);
		  
		  if(pattern.matcher("Maharashtra").matches()==true)
			  System.out.println(pattern.matcher("Maharashtra").matches());
		  
		  if(userNamePattern.matcher("898").matches()==true)
			  System.out.println(userNamePattern.matcher("a_b").matches());
	}

}
