package com.visa.core.java.bank;

public class OverDraftWithdrawalRule implements GrantWithdrawalStratergy{

	@Override
	public boolean withdrawStratergy( double balance, double amountWithdrawn, double overdraft, int numOfWithdrawals ){
		if( balance + amountWithdrawn > -overdraft )
			return true;
		return false;
	}

}
