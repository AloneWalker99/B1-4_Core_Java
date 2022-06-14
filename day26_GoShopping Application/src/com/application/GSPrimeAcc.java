package com.application;

import com.framework.PrimeAccount;

public class GSPrimeAcc extends PrimeAccount{
		

		public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
			super(accNo, accNm, charges, isPrime);
			
			
		}
		
		@Override
		public String toString() {
			return String.format("GSPrimeAcc [toString()=%s]", super.toString());
		}
		
		

	}
