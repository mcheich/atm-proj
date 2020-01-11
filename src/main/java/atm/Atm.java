package atm;

public class Atm {
	
	private String requiredPin;
	private double balance;

	public Atm(String pin, double beginBalance) {
		requiredPin = pin;
		balance = beginBalance;
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

	public void deposit(double moneyIn) {
		balance += moneyIn;
	}
	
}
