package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String alternativeEmail;
	private String password;
	private String email;
	private String department;
	private int defaultPasswordLength;
	private int mailBoxCapacity = 500;
	private String companySufix = "BGORAFarm.com";
	
	//Constructor to received first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//System.out.println("EMAIL CREATED: " + this.firstName +" " + this.lastName);
		
		
		// call for a method that is asking for department - returning department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		
		//call a method that return a random password
		this.password = randomPassword(8);
		System.out.println("Your Password is: " + this.password);
		
		//Combine element to generate email
		email = firstName.toLowerCase() +"."+ lastName.toLowerCase() +"@"+ department +"."+ companySufix;
		//System.out.println("Your email is: " + email);
		
	}
	
	// Ask for department
	private String setDepartment() {
		System.out.print("New worker: "+ firstName +" "+ lastName +"\nDepartment Codes:\n1 for sales\n2 for development\n3 for accounting \n0 for none\n Enter codes:");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice == 1) { return "sales";}
		else if(deptChoice == 2) { return "dev";}
		else if(deptChoice == 3) { return "acct";}
		else{ return "";}
		}
		
	//  Generate a random passwords
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWYX123456789&$#@%";
		char [] password = new char [length];
		for(int chpass = 0; chpass < length; chpass ++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[chpass] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	//Set the mailBoxCapacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity = capacity;
	}
		
	//Set alternative email
	public void setAlternativeEmail(String altmail) {
		this.alternativeEmail = altmail;
	}
		
	//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	public String getPassword() {
		return password;
	}
	public String getAlternativeEmail() {
		return alternativeEmail;
	}
	
	public String showInfor() {
		return "DISPLAY NAME: "+ firstName +" "+ lastName +
				"\nCOMPANY EMAIL: "+ email +
				"\nMAILBOX CAPACITY: "+ mailBoxCapacity + "mb";
		}
}