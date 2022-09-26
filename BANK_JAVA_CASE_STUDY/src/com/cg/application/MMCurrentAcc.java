package com.cg.application;
import com.cg.framework.*;


	public class MMCurrentAcc extends CurrentAcc {
//		Constructor
		public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
			super(accNo, accNm, accBal, creditLimit);
		}

		public void withdraw(float amt) {
			super.withdraw(amt);
			System.out.println("AVAILABLE BALANCE: " + getAccBal());
			System.out.println("CREDIT LIMIT: "+getCreditLimit());
		}
	}
