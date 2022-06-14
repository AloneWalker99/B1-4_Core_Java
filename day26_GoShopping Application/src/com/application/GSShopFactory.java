package com.application;

import com.framework.ShopFactory;

public abstract class GSShopFactory extends ShopFactory{
	
	
	public GSPrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges,boolean isPrime) {
		GSPrimeAcc p=new GSPrimeAcc(accNo,accNm,charges,isPrime);
		return p;
	}

	
	public GSNormalAcc getNewNormalAccount(int accNo, String accNm, float charges,float deliveryCharges) {
		GSNormalAcc n=new GSNormalAcc(accNo,accNm,charges,deliveryCharges);
		return n;
	}



}