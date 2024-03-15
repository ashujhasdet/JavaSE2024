package programmingSet2;
//A JAVA PROGRAM TO PERFORM WIDENING ON PRIMITIVE DATA TYPES
public class AllWidening {
	public static void main (String[] args) {
		System.out.println("Main Starts");
		/* INCREASING ORDER OF PRIMITIVE DATA TYPES ACCORDING TO RANGE
		 * BYTE->SHORT->CHAR->INT->LONG-> FLOAT-> DOUBLE
		 * BOOLEAN TYPECASTING IS NOT ALLOWED IN JAVA   
		TRY  ALL COMBINATIONS FOR WIDENING
		 1.BYTE TO SHORT
		 2.BYTE TO CHAR
		 3.BYTE TO INT
		 4.BYTE TO LONG
		 5.BYTE TO FLOAT
		 6.BYTE TO DOUBLE
		 7.SHORT TO CHAR
		 8.SHORT TO INT
		 9.SHORT TO LONG
		 10.SHORT TO FLOAT
		 11.SHORT TO DOUBLE
		 12.CHAR TO INT
		 13.CHAR TO LONG
		 14.CHAR TO FLOAT 
		 15.CHAR TO DOUBLE
		 16.INT TO LONG
		 17.INT TO FLOAT
		 18.INT TO DOUBLE
		 19.LONG TO FLOAT 
		 20.LONG TO DOUBLE
		 21.FLOAT TO DOUBLE
		 * */
		System.out.println("WIDENING OPERATIONS:");
		System.out.println("------------------------------");
		System.out.println("BYTE TO LARGER DATA TYPE:");
		byte b = 27;
		short s = b;
		//char c = b;
		int i = b;
		long l = b;
		float f = b;
		double d = b;
		System.out.println("byte b = "+ b);
		System.out.println("byte to short is = "+s);
		System.out.println("byte to int is = "+i);
		System.out.println("byte to long is = "+l);
		System.out.println("byte to float is = "+f);
		System.out.println("byte to double is = "+d);
		System.out.println("----------------------------");
		
		System.out.println("SHORT TO LARGER DATA TYPE:");
		short s1 = 234;
		//char c1 = s1;
		int i1 = s1;
		long l1= s1;
		float f1= s1;
		double d1=s1;
		System.out.println("Short s1 = "+ s1);
		System.out.println("short  to int  is = "+i1);
		System.out.println("short  to long  is = "+l1);
		System.out.println("short  to float  is = "+f1);
		System.out.println("short  to double  is = "+d1);
		System.out.println("-------------------------------");
		
		System.out.println("CHAR TO LARGER DATA TYPE:");
		char c2 = 'w';
		int i2 = c2;
		long l2 = c2;
		float f2= c2;
		double d2 = c2;
		System.out.println("Char c2 = "+c2);
		System.out.println("Char to int = "+i2);
		System.out.println("Char to long = "+l2);
		System.out.println("Char to float = "+f2);
		System.out.println("Char to double = "+d2);
		System.out.println("---------------------------------");
		
		System.out.println("INT TO LARGER DATA TYPE:");
		int n = 100;
		long l3= n;
		float f3= n;
		double d3=n;
		System.out.println("int n = "+n);
		System.out.println("int to long = "+l3);
		System.out.println("int to float ="+f3);
		System.out.println("int to double = "+ d3);
		System.out.println("-----------------------------------");
		
		System.out.println("LONG TO LARGER DATA TYPE:");
		long l4 = 234897l;// we are still in integer range
		float f4 = l4;
		double d4 = l4;
		System.out.println("long l4 ="+ l4);
		System.out.println("long to float ="+ f4);
		System.out.println("long to double = "+ d4);
			
		System.out.println("-----------------------------------");
		System.out.println("FLOAT TO LARGER DATA TYPE:");
		float f5 = 768765.987654f;
		double d5 = f5;
		System.out.println("Float f5 = "+ f5);
		System.out.println("Float to double = "+d5);
		
		System.out.println("-----------------------------------");
		
		System.out.println("Main Ends");
		
	}

}
