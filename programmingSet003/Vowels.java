package programmingSet3;

//A Java program to read vowels as input from user and print on console using Buffered Reader
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Vowels {
	public static void main(String[] args) throws IOException {
		System.out.println("Main Starts");
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader vowels = new BufferedReader(input);
		System.out.println("Enter First Vowel");
		String v1 = vowels.readLine();
		System.out.println("Enter Second Vowel");
		String v2 = vowels.readLine();
		System.out.println("Enter Third Vowel");
		String v3 = vowels.readLine();
		System.out.println("Enter Fourth Vowel");
		String v4 = vowels.readLine();
		System.out.println("Enter Fifth Vowel");
		String v5 = vowels.readLine();
		
		System.out.println("Vowels are :");
		System.out.print(v1+" "+v2+" "+v3+" "+v4+" "+v5);
		System.out.println();
		
		vowels.close();
		
		System.out.println("Main Ends");
		
	}

}
