package com.visa.core.java.bank;

public class FeeBalanceRule implements ApplyFeeStratergy {
	@Override
	public double appliedFee(  int numOfTransactions, double balance ){
		if(  balance < 0){
			return -50.00;
		}
		return 0.0;
	}

}
