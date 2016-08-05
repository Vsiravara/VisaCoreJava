package com.visa.core.java.Account;

public abstract class Account {
	private long balance = 0;
	private String holderName = null;
	public Account( String holderName ){
		this.holderName = holderName;
	}
	
	public final void transaction( String message, long amount ){
		System.out.print( this.holderName  + " " + message + " " + amount  + "\n" );
		this.balance += amount;
	}
	public long getBalance(){
		return this.balance;
	}
	
	public abstract boolean deposit( long amount ) ;
	public abstract boolean withdraw( long amount );
	
	
}
