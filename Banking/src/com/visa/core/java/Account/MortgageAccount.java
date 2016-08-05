package com.visa.core.java.Account;

public class MortgageAccount extends Account {
	double amountBorrowed;
	public MortgageAccount( String holderName, double amountBorrowed ){
		super(holderName);
		this.amountBorrowed = amountBorrowed;
		System.out.print("Initial amount borrowed = " + amountBorrowed + "\n" );
		
	}
	@Override
	public boolean deposit( long amount ){
		this.transaction("Mortagage Payment", amount);
		return true;
	}
	
	@Override
	public boolean withdraw( long amount ){
		return false;
	}

}
