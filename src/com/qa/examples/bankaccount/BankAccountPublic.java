package com.qa.examples.bankaccount;

public class BankAccountPublic {

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
		// build method creates instance of class object and                      //
		// returns it with all the variables set                                  //
		public BankAccountPublic build() {                                        //
			BankAccountPublic bankAccountPublic = new BankAccountPublic();        //
			bankAccountPublic.accountNumber = accountNumber;                      //
			bankAccountPublic.owner = owner;                                      //
			bankAccountPublic.branch = branch;                                    //
			bankAccountPublic.balance = balance;                                  //
			bankAccountPublic.interestRate = interestRate;                        //
			return bankAccountPublic;                                             //
		}                                                                         //
	}// End of Builder class.///////////////////////////////////////////////////////
	
	// Default constructor set to private.
	private BankAccountPublic() {}
	
	// Class constructor
		public BankAccountPublic(long accountNumber, String owner, String branch, double balance, double interestRate) {                                                            
			this.accountNumber = accountNumber;                           
			this.owner = owner;                                                   
			this.branch = branch;                                               
			this.balance = balance;                                        
			this.interestRate = interestRate;
		}

	@Override
		public String toString() {
			return "BankAccountPublic [accountNumber=" + accountNumber + ", owner=" + owner + ", branch=" + branch
					+ ", balance=" + balance + ", interestRate=" + interestRate + "]";
		}

}
