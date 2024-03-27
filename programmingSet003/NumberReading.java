package programmingSet3;
// A Java Program to read any 5 decimal values using Buffered Reader from user and print respective integer on console
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class NumberReading {
	public static void main(String[] args) throws IOException {
		System.out.println("Main Start");
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader   numbers = new BufferedReader(input);
		System.out.println("Enter First Decimal Number:");
		float num1 = Float.parseFloat(numbers.readLine());//String to float
		int int1 = (int)num1;//narrowing
		System.out.println("Enter Second Decimal Number:");
		float num2 = Float.parseFloat(numbers.readLine());
		int int2 = (int) num2;
		
		System.out.println("Enter Third Decimal Number:");
		float num3 = Float.parseFloat(numbers.readLine());
		int int3 = (int)num3;
		System.out.println("Enter Fourth Decimal Number:");
		float num4 = Float.parseFloat(numbers.readLine());
		int int4 = (int)num4;
		System.out.println("Enter Fifth Decimal Number:");
		float num5 = Float.parseFloat(numbers.readLine());	
		int int5 = (int)num5;
		System.out.println("Respective Integer values for All Input Numbers are: ");
		System.out.println(int1);
		System.out.println(int2);
		System.out.println(int3);
		System.out.println(int4);
		System.out.println(int5);
		
		//close the resource 
		numbers.close();
		System.out.println("Main Ends");
	}

}
