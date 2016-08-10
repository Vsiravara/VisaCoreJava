package com.visa.core.java.bank;

public class ExceedTransactionLimitWithdrawalRule implements GrantWithdrawalStratergy {


	@Override
	public boolean withdrawStratergy( double balance, double amount, double overdraft, int numOfWithdrawals){
		if( numOfWithdrawals < 2 && balance + amount > -numOfWithdrawals )
			return true;
		return false;
		
	}

}
