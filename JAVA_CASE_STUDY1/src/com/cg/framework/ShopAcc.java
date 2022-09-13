package com.cg.framework;

import com.cg.application.*;

	 public abstract class ShopAcc{
			protected int  accNo;
			protected String accNm;
			private float charges;
			
			public int getAccNo() {
				return accNo;
			}
			public void setAccNo(int accNo) {
				this.accNo = accNo;
			}
			public float getCharges() {
				return charges;
			}
			public void setCharges(float charges) {
				this.charges = charges;
			}
			public String getAccNm() {
				return accNm;
			}
			public void setAccNm(String accNm) {
				this.accNm = accNm;
			}
			
			
			public ShopAcc(int accNo, String accNm, float charges) 
			{

				this.accNo = accNo;
				this.setAccNm(accNm);
				this.charges = charges;
			}
			public void bookProduct(float charges)
			{
				System.out.println("Product booked and charges are:"+charges);
			}
			public void items(float charges)
			{
				System.out.println("Items are delivered with charges :"+charges);
			}

			
			@Override
			public String toString() {
				return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getClass()=" + getClass()
						+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
			}
			

	 }
 

