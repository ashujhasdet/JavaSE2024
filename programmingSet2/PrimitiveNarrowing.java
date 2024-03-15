package programmingSet2;
// A Java program to perform all possible combination of Narrowing (Converting larger primitive data type to smaller data type)
public class PrimitiveNarrowing {
	public static void main (String[] args) {
		System.out.println("Main Start");
		/* ALL POSSIBLE COMBINATION FOR NARROWING    
		 * DOUBLE TO FLOAT
		 * DOUBLE TO LONG
		 * DOUBLE TO INT
		 * DOUBLE TO CAHR
		 * DOUBLE TO SHORT
		 * DOUBLE TO BYTE
		 * 
		 * FLOAT TO LONG
		 * FLOAT TO INT
		 * FLOAT TO CAHR
		 * FLOAT TO SHORT
		 * FLOAT TO BYTE
		 * 
		 * LONG TO INT
		 * LONG TO CAHR
		 * LONG TO SHORT
		 * LONG TO BYTE
		 * 
		 * INT TO CAHR
		 * INT TO SHORT
		 * INT TO BYTE
		 * 
		 * CHAR TO SHORT
		 * CHAR TO BYTE
		 * 
		 * SHORT TO BYTE
		 * */
		
		System.out.println("NARROWING OPERATION: ");
		System.out.println("---------------------------------------------");
		System.out.println("DOUBLE TO SMALLER DATA TYPE:");
		double d1 = 89876.9876d;
		// LOGIC : type cast or narrow double value to float using () and store in a new variable of float type
		//Explicit Type Casting Or Narrowing
		float f1 = (float)d1;
		long l1 = (long)d1;
		int n1 = (int)d1;
		char c1 = (char)d1;
		short s1 = (short)d1;
		byte b1 = (byte)d1;
		//Print on console
		System.out.println("Double d1 = "+d1);
		System.out.println("Double to float = "+f1);
		System.out.println("Double to long = "+l1);
		System.out.println("Double to int = "+n1);
		System.out.println("Double to char = "+c1);
		System.out.println("Double to short = "+s1);
		System.out.println("Double to byte = "+b1);
		System.out.println("---------------------------------------------");
		
		/* Above we first type casted explicitly double value to all other
		 * data type and stored converted result in separate new variable and finally printed it .
		 * 
		 *    
		 * Now we will do the type casting and print the result at same time
		 * 
		 */
		float f2 = 3435.987f;
		System.out.println("FLOAT TO SMALLER DATA TYPE");
		System.out.println("Float value f2 ="+f2);
		System.out.println("float to long = "+(long)f2);
		System.out.println("float to int = "+(int)f2);
		System.out.println("float to char = "+(char)f2);
		System.out.println("float to short = "+(short)f2);
		System.out.println("Float to byte = "+ (byte)f2);
		System.out.println("---------------------------------------------");
		
		long l= 659876453;
		System.out.println("LONG TO SMALLER DATA TYPE:");
		System.out.println("Long l ="+l);
		System.out.println("Long to int  ="+(int)l);
		System.out.println("Long to char ="+(char)l);
		System.out.println("Long to short ="+(short)l);
		System.out.println("Long to byte ="+(byte)l);
		System.out.println("---------------------------------------------");
		
		int n = 198;
		System.out.println("INT TO SMALLER DATA TYPE:");
		System.out.println("Int n ="+n);
		System.out.println("Int to char ="+(char)n);
		System.out.println("Int to short ="+(short)n);
		System.out.println("Int to byte ="+(byte)n);
		System.out.println("---------------------------------------------");
		
		char c = 'a';
		System.out.println("CHAR TO SMALLER DATA TYPE");
		System.out.println("Char c = "+c);
	    System.out.println("Char to short= "+(short)c);
	    System.out.println("Char to byte ="+ (byte)c);
	    System.out.println("---------------------------------------------");
	    
	    short s =129;
	    System.out.println("SHORT TO SMALLER DATA TYPE");
	    System.out.println("Short s = "+s);
	    System.out.println("Short to byte = "+(byte)s);
	    System.out.println("---------------------------------------------");
		System.out.println("Main Ends");
	}

}
