package jUnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import atm.Atm;

public class ATMUnitTests {

	//Arrange
	Atm underTest = new Atm("1234", 297.00);
	
	@Test
	public void allowAccessTest() {
		//Act
		boolean result = underTest.allowAcess("1234");
		//Assert
		assertEquals(true, result);
	}
	
	@Test
	public void denyAccessTest() {
		//Act
		boolean result = underTest.allowAcess("1010");
		//Assert
		assertEquals(false, result);
	}
	
	@Test
	public void getBalanceTest() {
		//Act
		double result = underTest.getBalance();
		//Assert
		assertTrue(297.00 == result);	
	}

	@Test
	public void depositTest() {
		//Act
		underTest.deposit(3.33);
		//Assert
		assertTrue(underTest.getBalance() == 300.33);	
	}
	
	
	

}
