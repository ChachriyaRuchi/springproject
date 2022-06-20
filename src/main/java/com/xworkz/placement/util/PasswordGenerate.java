package com.xworkz.placement.util;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;

import com.xworkz.placement.service.RegistrationService;

public class PasswordGenerate {
	private final static Logger logger=LogManager.getLogger(PasswordGenerator.class);
	/*
	 * public static String generatePassayPassword() {
	 * 
	 * logger.info("INFO - generate password method PasswordGenerate invoked");
	 * 
	 * try { throw new Exception("Exception occurs"); }catch(Exception e) {
	 * logger.error(e.getMessage(),e); }
	 * 
	 * 
	 * CharacterRule alphabets = new
	 * CharacterRule(EnglishCharacterData.Alphabetical); CharacterRule digits = new
	 * CharacterRule(EnglishCharacterData.Digit); CharacterRule special = new
	 * CharacterRule(EnglishCharacterData.Special);
	 * 
	 * PasswordGenerator passwordGenerator = new PasswordGenerator(); String
	 * password = passwordGenerator.generatePassword(8, alphabets, digits, special);
	 * System.out.println(password); return password; }
	 */
	
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
