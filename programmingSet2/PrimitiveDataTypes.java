package programmingSet2;
//A Java Program to declare, initialize and print one variable of all primitive data types in Java
public class PrimitiveDataTypes {
	public static void main(String [] args) {
		System.out.println("Main Starts");
		//Declarations
		//Numeric Data Types
		//Integer Primitive Values
		byte b;
		short s;
		int i;
		long l;
		
		//Floating Primitive Values
		float f;
		double d;
		//Character Primitive Value
		char c;
		//Boolean Primitive Value
		boolean t;
		
		//Initialization
		b =120;
		s = 3000;
		i = 12678;
		l = 989878l;
		f= 990089.909089f;
		d = 89892898.987867d;
		c = 'x';
		t = true;
		
		//Printing
		System.out.println("The Primitive Data Type Variable are : ");
		System.out.println("-----------------------------------------");
		System.out.println("byte value b = "+ b);
		System.out.println("short value s = "+ s);
		System.out.println("int value i = "+ i);
		System.out.println("long value l = "+ l);
		System.out.println("float value f = "+ f);
		System.out.println("double value d ="+d);
		System.out.println("Char value c = "+ c);
		System.out.println("boolean value t = "+t);
		
		System.out.println("Main Ends");
		
	}

}
