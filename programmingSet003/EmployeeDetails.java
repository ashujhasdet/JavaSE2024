package programmingSet3;
//A Java Program to read and print any 3 details of an Employee using Scanner class
import java.util.Scanner;
public class EmployeeDetails {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Employee Name :");
		String name = input.nextLine();
		System.out.println("Enter Employee Company Name :");
		String company = input.nextLine();
		System.out.println("Enter Employee Salary :");
		float salary = input.nextFloat();
		
		System.out.println("Employee Details are  :");
		System.out.println("Name = "+name);
		System.out.println("Comapny Name = "+company);
		System.out.println("Salary = "+salary);
		
		input.close();

		System.out.println("Main Ends");
	}

}
