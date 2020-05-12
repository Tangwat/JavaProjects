package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int costOfCourse = 600;
	private int tuitionBalance = 0;
	private static int id = 1000;

	// Constructor prompt user to enter's firstName and year
	public Student() {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Enter student firstName: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter student lastName: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - for freshman\n2 - for sophmore\n3 - for junior\n4 - for senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		System.out.println(firstName +" "+ lastName +" "+ gradeYear +" "+studentID);
		}
	
	//Generate an ID
	private void setStudentID() {
	
		//Grade level + id
		id++;
		this.studentID = gradeYear +" "+ id;
	}
	
	//Enroll in causes
	public void enroll() {
		
		//get inside the loop, user hit Q
		do{
			System.out.print("Enter student course(Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses +"\n  "+ course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		}while(1!=0);
		System.out.println("ENROLLED IN: " + courses);
		//System.out.println("TUITION BALANCE: " + tuitionBalance);

	}
	
	//View Balance
	public void viewBalance() {
		System.out.println("Your Balance is : $" + tuitionBalance);
	}
	
	//Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for the payment of $" + payment);
		viewBalance();		
	}
	//Show Status
	public String toString() {
		return "Name:" + firstName +" "+ lastName +
				"\nGrade level:" + gradeYear +
				"\nStudentID:" + studentID +
				"\nCourses Enrolled:" + courses +
				"\nBalance: $" + tuitionBalance;
	}
 }
	