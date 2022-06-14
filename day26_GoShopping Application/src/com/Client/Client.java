package com.Client;

import com.application.GSNormalAcc;
import com.application.GSPrimeAcc;
//import com.application.GSShopFactory;
import com.framework.NormalAccount;
import com.framework.PrimeAccount;
//import com.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ShopFactory obj=new GSShopFactory();
		PrimeAccount p=new GSPrimeAcc(153,"Soujan",250,true);
		NormalAccount n=new GSNormalAcc(144,"James",300,10);
		System.out.println("Prime account ");
		p.bookProduct(p.getCharge());
		System.out.println("Normal account");
		n.bookProduct(n.getCharges());
		System.out.println();
		System.out.println(p);
		System.out.println(n);
		}

	}

