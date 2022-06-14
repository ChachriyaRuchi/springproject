package com.xworkz.placement.utility;

import java.util.Random;

import org.passay.CharacterRule;
import org.passay.EnglishCharacterData;
import org.passay.PasswordGenerator;


public class PasswordGenerate {
	public String generatePassayPassword() {
		CharacterRule alphabets = new CharacterRule(EnglishCharacterData.Alphabetical);
	      CharacterRule digits = new CharacterRule(EnglishCharacterData.Digit);
	      CharacterRule special = new CharacterRule(EnglishCharacterData.Special);

	      PasswordGenerator passwordGenerator = new PasswordGenerator();
	      String password = passwordGenerator.generatePassword(8, alphabets, digits, special);
	      System.out.println(password);
	    return password;
	}
}
