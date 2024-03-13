package programmingSet2;
// A Java program to print ASCII Values of characters '0','1','2',---'9'
public class AsciiZeroToNine {
	public static void main(String[] args) {
		System.out.println("Main Starts");
		System.out.println("ASCII VALUE OF 0 to 9 ARE : ");
		System.out.println("------------------------------");
		//Characters 0 to 9 needs to be stored as integer to get ASCII value
		int a = '0';//Character '0' is type-casted to integer implicitly
		int b = '1';
		int c = '2';
		int d = '3';
		int e = '4';
		int f = '5';
		int g = '6';
		int h = '7';
		int i = '8';
		int j = '9';
		
		System.out.println("Everything is done by Compiler Implicityly ==> WIDENING");		
		System.out.println("ASCII value of 0 = "+a);
		System.out.println("ASCII value of 1 = "+b);
		System.out.println("ASCII value of 2 = "+c);
		System.out.println("ASCII value of 3 = "+d);
		System.out.println("ASCII value of 4 = "+e);
		System.out.println("ASCII value of 5 = "+f);
		System.out.println("ASCII value of 6 = "+g);
		System.out.println("ASCII value of 7 = "+h);
		System.out.println("ASCII value of 8 = "+i);
		System.out.println("ASCII value of 9 = "+j);
		System.out.println("Main Ends");
	} 

}
