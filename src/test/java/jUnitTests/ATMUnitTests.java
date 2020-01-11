package jUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

public class ATMUnitTests {

	@Test
	public void allowAccessTest() {
		//Arrange
		Atm underTest = new Atm();
		//Act
		boolean result = underTest.allowAcess("1234");
		//Assert
		assertEquals(true, result);
		
	}

}
