package com.KarenEP.javaforbeginners;

public class Javaforbeginners {

	public static void main(String[] args) {
		System.out.println ("Hello world :)");  // Print function 
		
		// Types of numbers
		short  s = 0; // Data type rang of values[-128,127], equal to 2 bytes
		byte   b = 0; // Values[-32768, 32767]
		int    i = 0; // Values (widely used)
		long   l = 0; // Vales (really long values)
		float  f = 0.0F; // Decimal values [4 bytes]
		double d = 0.0; // Decimal values (longer values) [8 bytes] (widely used)
		
		// Other types of data
		char    genre = 'f';   // Unicode character (only one word)
		boolean status= false; // Logical object [true,false]
		 
		// Cast of variables (changing the type of the data)
		long   x =(long) i;   // From int to long
		double y =(double) f; // From float to double
		
	}

}
