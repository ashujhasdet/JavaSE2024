package programmingSet3;
// A Java program to ask user's name and address and print on console using bufferd read

import java.io.BufferedReader;// required for BufferedReader
import java.io.IOException;
import java.io.InputStreamReader; //required for Input stream reader
public class UserDetails {
	public static void main(String[] args) throws IOException{
		System.out.println("Main Starts");
		System.out.println("Enter User Name:");
		InputStreamReader name = new InputStreamReader(System.in);//buffered reader needs an object of input stream reader
		BufferedReader userName = new BufferedReader(name);//An object of buffered reader to read input from user
		String inputName = 	userName.readLine();//reference variable for user Name input
		
		System.out.println("Enter User Address:");
		String inputAddress = userName.readLine();//object reference variable for user address input
		
		System.out.println("User Name is : " + inputName);
		System.out.println("User Address is : " + inputAddress);
		
		//BufferedReader is a system resource, hence closing it always recommended
		userName.close();
		
		System.out.println("Main Ends");
	}
	

}
