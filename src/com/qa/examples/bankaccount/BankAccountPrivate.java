package com.qa.examples.bankaccount;

public class BankAccountPrivate {

	// Multiple instance variables of the class.
	private long accountNumber;
	private String owner;
	private String branch;
	private double balance;
	private double interestRate;

	// Static builder class defined within the class itself.////////////////////////
	public static class Builder {                                                 //
		// Pass same instance variables.                                          //
		private long accountNumber;                                               //
		private String owner;                                                     //
		private String branch;                                                    //
		private double balance;                                                   //
		private double interestRate;                                              //
		                                                                          //
		// Builder constructor not necessary but defines required argument(s).    //
		public Builder(long accountNumber) {                                      //
			this.accountNumber = accountNumber;                                   //
		}                                                                         //
		                                                                          //
		// Methods that set each variable and return the object.//                //
		public Builder owner(String owner) {                    //                //
			this.owner = owner;                                 //                //
			return this;                                        //                //
		}                                                       //                //
                                                                //                //
		public Builder branch(String branch) {                  //                //
			this.branch = branch;                               //                //
			return this;                                        //                //
		}                                                       //                //
                                                                //                //
		public Builder balance(double balance) {                //                //
			this.balance = balance;                             //                //
			return this;                                        //                //
		}                                                       //                //
                                                                //                //
		public Builder interestRate(double interestRate) {      //                //
			this.interestRate = interestRate;                   //                //
			return this;                                        //                //
		}// End of methods.///////////////////////////////////////                //
                                                                                  //
		// build method passes the Builder object to the class constructor        //
		public BankAccountPrivate build() {//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\/
			return new BankAccountPrivate(this);                                  //             \/
		}         														          //             \/
                                                                                  //             \/
	}// End of Builder class.///////////////////////////////////////////////////////             \/
//                                                                                               \/
	// Private class constructor which constructs the class object using the Builder object      \/
	private BankAccountPrivate(Builder builder) {//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\/                                                          
		this.accountNumber = builder.accountNumber;
		this.owner = builder.owner;
		this.branch = builder.branch;
		this.balance = builder.balance;
		this.interestRate = builder.interestRate;
	}
	
	@Override
	public String toString() {
		return "BankAccountPrivate [accountNumber=" + accountNumber + ", owner=" + owner + ", branch=" + branch
				+ ", balance=" + balance + ", interestRate=" + interestRate + "]";
	}

}
