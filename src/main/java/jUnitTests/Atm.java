package jUnitTests;

public class Atm {
	
	private String pin = "1234";

	public boolean allowAcess(String pinEntered) {
		
		if(pinEntered.equals(pin)) {
		return true;
		}
		
		return false;
	}

}
