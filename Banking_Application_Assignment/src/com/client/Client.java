package com.client;

import com.application.MMBankFactory;
import com.application.MMCurrentAcc;
import com.application.MMSavingAcc;
import com.framework.BankFactory;
import com.framework.CurrentAcc;
import com.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankFactory obj=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(153, "Sumanth", 100000, true, 100);
		CurrentAcc c=new MMCurrentAcc(152, "Lokesh", 10000.0f, 1000.0f);
		System.out.println("Saving Account: ");
		s.withdraw(350.0f);
		System.out.println();
		System.out.println("Current Account: ");
		c.withdraw(400.0f);
		System.out.println();
		
		System.out.println(s);
		System.out.println(c);
	}

}
