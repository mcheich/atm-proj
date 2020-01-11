package jUnitTests;

public class Atm {
	
	private String requiredPin;
	private double balance = 297.00;

	public Atm(String pin) {
		requiredPin = pin;
	}

	public boolean allowAcess(String pinEntered) {
		
		if(pinEntered.equals(requiredPin)) {
		return true;
		}
		
		return false;
	}

	public double getBalance() {
	
		return balance;
	}

}
