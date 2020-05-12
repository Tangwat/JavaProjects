package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		//Ask how many student you want to add
		System.out.print("Enter number of new student to enroll: ");
		Scanner in = new Scanner (System.in);
		int numberOfStudent = in.nextInt();
		Student[] students = new Student [numberOfStudent];
		
		//Create a number of new students
		for(int newS = 0; newS < numberOfStudent; newS++) {
			students [newS] = new Student();
			students[newS].enroll();
			students[newS].payTuition();
		}
		for(int newS = 0; newS < numberOfStudent; newS++) {
			System.out.println(students[newS].toString());
		}
	}

}
