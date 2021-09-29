package com.qa.examples.bankaccount;

public class BankAccountOld {

	// Multiple instance variables of the class.
	private long accountNumber;
	private String owner;
	private String branch;
	private double balance;
	private double interestRate;

	// Class constructors
	public BankAccountOld(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BankAccountOld(long accountNumber, String owner, String branch, double balance, double interestRate) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.branch = branch;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public BankAccountOld(long accountNumber, String owner, String branch) {
		this.accountNumber = accountNumber;
		this.owner = owner;
		this.branch = branch;
	}
	
	// And many more combinations
	
	@Override
	public String toString() {
		return "BankAccountOld [accountNumber=" + accountNumber + ", owner=" + owner + ", branch=" + branch
				+ ", balance=" + balance + ", interestRate=" + interestRate + "]";
	}

}
