package com.qa.examples.bankaccount;

public class BankAccountDemo {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Using the class constructor.
		
		BankAccountOld badISA = new BankAccountOld(1234L, "Matthew", "Nowhere", 100, 0.3);
		BankAccountOld goodISA = new BankAccountOld(1234L, "Matthew", "Nowhere", 0.3, 100);

		
		System.out.println("\nBad ISA: " + badISA.toString() + "\nGood ISA: " + goodISA.toString());
		
		// could do badISA.setaccoundNumber().setinterestRate()... and so on, but then you would always be able to change them.
		
		System.out.println("\n*********************************************************************************************************\n");
		
		// Create objects using constructor and builder methods using this pattern.
		
		BankAccountPrivate current = new BankAccountPrivate.Builder(1234L)
				.owner("Matthew") 
				.branch("Nowhere") 
				.balance(1000000L) 
				.interestRate(5L)  
				.build();
		
		
		System.out.println(current.toString());

//		BankAccountPrivate offshore = new BankAccountPrivate(); Not allowed because the constructor is not visible (private).
		
		System.out.println("\n*********************************************************************************************************\n");
		
		BankAccountPublic savings = new BankAccountPublic.Builder(4321L)
				.owner("Jason")
				.branch("Somewhere")
				.balance(10000L)
				.interestRate(1L)
				.build();
	

		System.out.println(savings.toString() + "\n");
		
		BankAccountPublic offshore = new BankAccountPublic(1234L, "Matthew", "Nowhere", 100, 0.3);
		
	}
}
