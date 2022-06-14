package com.framework;

public abstract class NormalAccount extends ShopAccount {
	private final float deliveryCharges;

	public NormalAccount(int accNo, String accNm, float charges,float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges=deliveryCharges;
	}
	public void bookProduct(float charges) {
	
		System.out.println("Account no is "+this.getAccNo()+"   Account Name is   "+this.getAccNm()+ "  "+"charge is "+  (charges+deliveryCharges));
	}
	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharges=%s, toString()=%s]",
				deliveryCharges, super.toString());
	}
	
	

}