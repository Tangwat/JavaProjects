package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		/*
		Checking chkacct = new Checking("Tom Wilson", "453981345", 4200);
		Savings savacct = new Savings("Sam Bakson", "784290321", 6700);
		//savacct.compound();
		chkacct.showInfo();
		System.out.println("---------------------------");
		savacct.showInfo(); 
		*/
		
		// Read a CSV File then create new account based on that data
		String file = "C:\\Users\\SierraZuluBravo\\Documents\\NewBankAccount.csv";
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		for(String[] accountHolder : newAccountHolders) {
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			//System.out.println(name + " " + sSN + " " + accountType +" $" + initDeposit);
			if(accountType.equals("Savings")) {
				//System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Savings(name, sSN, initDeposit));
			}
			else if(accountType.equals("Checking")) {
				//System.out.println("OPEN A SAVINGS ACCOUNT");
				accounts.add(new Checking(name, sSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		for(Account acct : accounts) {
			System.out.println("\n---------------------");
			acct.showInfo();
		}
	}

}
 