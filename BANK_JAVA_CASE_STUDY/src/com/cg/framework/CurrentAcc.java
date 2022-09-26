package com.cg.framework;

public abstract class CurrentAcc extends BankAcc {
	private float creditLimit;

	public float getCreditLimit() {
		return creditLimit;
	}

//	Constructor
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal); //superclass
		this.creditLimit = creditLimit;
	}

	@Override
	public void withdraw(float amt) {
		if (amt > getAccBal() + creditLimit) {
			System.out.println("insufficient balance".toUpperCase());
			System.out.println("Trasaction Failed.");
		} else if (getAccBal() >= amt) {
			setAccBal(getAccBal() - amt);
			System.out.println("Trasaction Complete.");
			
		} else {
			amt -= getAccBal();
			creditLimit -= amt;
			setAccBal(0);
			System.out.println("Trasaction Complete.");
		}
	}

	@Override
	public String toString() {
		System.out.println("Your account Number is " + (getAccNo()));
		System.out.println("Your Account Balance is " + getAccBal() + " & Your Credit Limit is " + creditLimit);

		return "CurrentAcc []";
	}

}
