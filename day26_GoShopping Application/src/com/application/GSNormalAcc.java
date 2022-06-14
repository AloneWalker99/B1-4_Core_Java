package com.application;

import com.framework.NormalAccount;

public class GSNormalAcc extends NormalAccount {

		public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
			super(accNo, accNm, charges, deliveryCharges);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			return String.format("GSNormalAcc [toString()=%s]", super.toString());
		}
		
		
		

	}
