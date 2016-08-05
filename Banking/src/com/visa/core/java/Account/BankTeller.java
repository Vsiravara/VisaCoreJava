package com.visa.core.java.Account;

public class BankTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] account = new Account[3]  ;
		account[0] = new MortgageAccount("Subject1", 100000 );
		account[1] = new CheckingAccount("Subject2", 200 );
		account[2] = new CheckingAccount("Subject3", 1000 );
		for( Account acc: account ){
			acc.deposit(1000);
			acc.withdraw(-500);
			acc.withdraw(-1000);
			acc.withdraw(-2000);
		}

	}

}
