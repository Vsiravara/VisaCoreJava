package com.visa.core.java.bank;

public class TesterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account(1000.0,"Person1", new ApplyFeeTransactionRule(),new OverDraftWithdrawalRule(), 500.0);
		Account account2 = new Account(1000.0,"Person2", new FeeBalanceRule(),new ExceedTransactionLimitWithdrawalRule(), 500.0);
		account1.deposit(1000);
		account1.withdraw(-100);
		account1.withdraw(-100);
		account2.withdraw(-100);
		account2.withdraw(-100);
	}

}
