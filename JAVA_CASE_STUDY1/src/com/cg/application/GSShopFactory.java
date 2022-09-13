package com.cg.application;

import com.cg.framework.*;

public class GSShopFactory implements ShopFactory 
{

	@Override
	public GSPrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) 
	{
		GSPrimeAcc gsprime = new GSPrimeAcc(AccNo, accNm, charges, isPrime);
		return gsprime;
	}

	@Override
	public GSNormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) 
	{
		GSNormalAcc gsnormal = new GSNormalAcc(AccNo, accNm, deliveryCharges, deliveryCharges);
		return gsnormal;
	}
	
	

	
}
