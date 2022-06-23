package com.xworkz.placement.util;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class PasswordGenerate {
	private final static Logger logger=LogManager.getLogger(PasswordGenerate.class);
	
	
	public static String randomPassword() {
		  String ALPHA_NUMERIC_STRING = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&?{}*";
		    StringBuilder builder = new StringBuilder();

		    int count = 8;

		    while (count-- != 0) {
		        int character = (int) (Math.random() * ALPHA_NUMERIC_STRING.length());
		        builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		    }
		    return builder.toString();
	}
}
