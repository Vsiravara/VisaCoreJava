package com.visa.core.java.bank;

public class Account {
	private int  numOfWithdrawals = 0;
	private double overdraft;
	private double balance = 0;
	private String holderName = null;
	private ApplyFeeStratergy applyFeeStratergy;
	private GrantWithdrawalStratergy grantWithdrawalStratergy;
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public ApplyFeeStratergy getApplyFeeStratergy() {
		return applyFeeStratergy;
	}
	public void setApplyFeeStratergy(ApplyFeeStratergy applyFeeStratergy) {
		this.applyFeeStratergy = applyFeeStratergy;
	}

	public void setGrantWithdrawalStratergy(GrantWithdrawalStratergy grantWithdrawalStratergy) {
		this.grantWithdrawalStratergy = grantWithdrawalStratergy;
	}


	public Account(double balance, String holderName, ApplyFeeStratergy applyFeeStratergy,
			GrantWithdrawalStratergy grantWithdrawalStratergy, double overdraft) {
		super();
		this.overdraft = overdraft;
		this.balance = balance;
		this.holderName = holderName;
		this.applyFeeStratergy = applyFeeStratergy;
		this.grantWithdrawalStratergy = grantWithdrawalStratergy;
	}
	private void transaction( String message, double amount ){
		System.out.print( this.holderName  + " " + message + " " + amount  + "\n" );
		this.balance += amount;
	}
	private double getBalance(){
		return this.balance;
	}
	public void withdraw( int amount ){
		if( this.grantWithdrawalStratergy.withdrawStratergy(this.getBalance(), amount, this.overdraft, this.numOfWithdrawals) ){
			this.transaction("Fee charged ", this.applyFeeStratergy.appliedFee(this.numOfWithdrawals, amount));
			this.transaction("Withdrawal amount ", amount);
			this.numOfWithdrawals += 1;
			
		}
		else{
			System.out.println("Withdraw declined \n" );
		}
		System.out.print("The remaining balance is "  + this.getBalance());
	}
	public void deposit( int amount ){
		this.balance += amount;
		System.out.println("Amount deposited " + amount );
		System.out.println("The remaining balance is " + this.getBalance());
	}

}
