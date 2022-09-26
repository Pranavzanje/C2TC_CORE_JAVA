package com.cg.application;
import com.cg.framework.*;
public class MMBankFactory extends BankFactory {

	@Override
	public MMSavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc obj = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return obj;
	}

	@Override
	public MMCurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc obj = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return obj;
	}
}
