package com.visa.core.java.bank;

public interface GrantWithdrawalStratergy {
	public boolean withdrawStratergy( double balance, double amount, double overdraft, int numOfWithdrawals );
	
}
