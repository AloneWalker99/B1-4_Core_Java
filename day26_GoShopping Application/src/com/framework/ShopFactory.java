package com.framework;

public abstract class ShopFactory {
	public abstract PrimeAccount getNewPrimeAccount(int accNo,String accNm,float delivaryCharges,boolean b);
	public abstract NormalAccount getNewNormalAccount(int accNo,String accNm,float delivaryCharges,float charges);

}
