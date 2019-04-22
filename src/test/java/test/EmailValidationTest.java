package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmailValidationTest {

	@Test
	void canValidateEmailWithNullValues() {
		boolean isValid=EmailValidation.validate(null);
		assertFalse(isValid);
	}
	
	@Test
	void canValidateEmailWithBlankValue() {
		boolean isValid=EmailValidation.validate("");
		assertFalse(isValid);
	}
	
	@Test
	void canValidateEmailWithCorrectEmailID() {
		boolean isValid=EmailValidation.validate("chandan.krk@gmail.com");
		assertTrue(isValid);
	}
	@Test
	void canValidateEmailWithCorrectEmailID2() {
		boolean isValid=EmailValidation.validate("chandan.krk@gmail.com");
		assertTrue(isValid);
	}

}
