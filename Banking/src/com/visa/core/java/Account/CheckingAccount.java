package com.visa.core.java.Account;

public class CheckingAccount extends Account {
	private double overDraftAmount;
	public CheckingAccount( String holderName, double overDraftAmount ) {
		// TODO Auto-generated constructor stub
		super( holderName );
		this.overDraftAmount = overDraftAmount;
	}
	@Override
	public boolean withdraw( long amount ){
		if( this.getBalance() + amount +this.overDraftAmount > 0 ){
			this.transaction("Checking Withdrawal", amount);
			return true;
		}
		return false;
	}
	@Override
	public boolean deposit( long amount ){
		this.transaction("Checking Deposit " , amount);
		return true;
	}

}
