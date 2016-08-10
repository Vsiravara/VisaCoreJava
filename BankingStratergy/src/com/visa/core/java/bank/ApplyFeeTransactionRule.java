package com.visa.core.java.bank;

public class ApplyFeeTransactionRule implements ApplyFeeStratergy {
	@Override
	public double appliedFee(  int numOfTransactions, double balance ){
		if( numOfTransactions >= 1 ){
			return -100.0;
		}
		return 0.0;
	}

}
