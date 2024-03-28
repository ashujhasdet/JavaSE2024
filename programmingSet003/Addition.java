package programmingSet3;
//Read 5 integer numbers from user and print the addition result on console
import java.util.Scanner;
public class Addition {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		//Scanner class object to take input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int num1 = input.nextInt(); 
		System.out.println("Enter Second Number : ");
		int num2 = input.nextInt();
		System.out.println("Enter Third Number : ");
		int num3 = input.nextInt();
		System.out.println("Enter Fourth Number : ");
		int num4 = input.nextInt();
		System.out.println("Enter Fifth Number : ");
		int num5 = input.nextInt();
		
		int sum = num1 + num2 + num3 + num4+ num5;
		System.out.println("Result Of Addition = "+sum);
		
		input.close();
		System.out.println("Main Ends");
	}
	

}
