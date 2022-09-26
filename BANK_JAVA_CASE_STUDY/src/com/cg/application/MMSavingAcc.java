package com.cg.application;

import com.cg.framework.*;
public class MMSavingAcc extends SavingAcc {
	private static final float MINBAL = SavingAcc.getMinbal();

	public static float getMinbal() {
		return MINBAL;
	}

//	Constructor
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}

	@Override
	public void withdraw(float amt) {
		super.withdraw(amt);
		System.out.println("AVAILABLE BALANCE: " + getAccBal());
}
}