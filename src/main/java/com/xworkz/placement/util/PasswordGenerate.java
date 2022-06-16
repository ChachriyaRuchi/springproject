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
	public static String generatePassayPassword() {
		
				logger.info("INFO - generate password method PasswordGenerate invoked");
				
				try {
					throw new Exception("Exception occurs");
				}catch(Exception e) {
					logger.error(e.getMessage(),e);
				}
				
				
		CharacterRule alphabets = new CharacterRule(EnglishCharacterData.Alphabetical);
		CharacterRule digits = new CharacterRule(EnglishCharacterData.Digit);
		CharacterRule special = new CharacterRule(EnglishCharacterData.Special);

		PasswordGenerator passwordGenerator = new PasswordGenerator();
		String password = passwordGenerator.generatePassword(8, alphabets, digits, special);
		System.out.println(password);
		return password;
	}
}
