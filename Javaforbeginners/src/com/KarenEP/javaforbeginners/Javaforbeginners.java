package com.KarenEP.javaforbeginners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Javaforbeginners {

	public static void main(String[] args) throws IOException {
		System.out.println ("Hello world :)");  // Print function 
		
		// Types of numbers
		short  s = 0; // Data type rang of values[-128,127], equal to 2 bytes
		byte   b = 0; // Values[-32768, 32767]
		int    i = 0; // Values (widely used)
		long   l = 0; // Vales (really long values)
		float  f = 0.0F; // Decimal values [4 bytes]
		double d = 0.0; // Decimal values (longer values) [8 bytes] (widely used)
		
		// Other types of data
		char    genre = 'f';   // Unicode character (only one letter)
		boolean status= false; // Logical object, values=[true,false]
		 
		// Cast of variables (changing the type of the data)
		long   x =(long) i;   // From int to long
		double y =(double) f; // From float to double
	
		// Create arrays of different dimensions
		
		int [ ] array1   = new int [4];          // Array of 4 integer numbers indices 0-3 (1 dimension) 
			array1 [0] = 1 ;                     // First element of the array1  
		double[][] array2 = new double [2][2];   // Matrix of 4 decimal numbers [row][column] (2 dimensions)
			array2 [0][0] = 1.2;
			array2 [0][1] = 1.3;
			array2 [1][0] = 1.4;
			array2 [1][1] = 1.5;
		char [][][] array3 = new char [2][2][2]; // Matrix of 8 char objects[row][col.][cell], indices 0-1 (3 dimensions)
			array3 [0][0][0] = 'a';  //Each letter indicate one unique cell
			array3 [0][0][1] = 'a';
			array3 [0][1][0] = 'b';
			array3 [0][1][1] = 'b';
			array3 [1][0][0] = 'c';
			array3 [1][0][1] = 'c';
			array3 [1][1][0] = 'd';
			array3 [1][1][1] = 'd';
		
		// How to print different types of arrays
			// Print it in one line
			/*  System.out.println(Arrays.toString(array1));      
				System.out.println(Arrays.deepToString(array2));
				System.out.println(Arrays.deepToString(array3));
	
			 
			//Print it in x rows	
			for(int row1=0; row1<2;row1++){									
				for(int col = 0; col<Array.getLength(array2) ; col++ ){
				System.out.print("["+array2[row1][col]+"]"+" ");
				}
				System.out.println(); // Different column
					
			}
			
			// Print it in x rows and x cells
			for(int row1=0; row1<array2.length;row1++){									
				for(int col = 0; col<array2[row1].length; col++ ){               // array lenght of columns 
					for(int cell = 0; cell<array2[row1].length; cell++ ){        // array lenght is the same for columns and cells
						System.out.print("[["+array3[row1][col][cell]+"]]"+" "); //Each cells [[][]]
					}
					System.out.print(" "); // Different column
				}	
				System.out.println(); // Different row 
			}
				
			*/

		// 	Increase or Decrease numbers
			int num=3;
			++num;    // Incress valor in 1 (number plus 1)
			num++;    // The Same but it prints numbers first(without increase)
			--num;    // Decress valor in 1 (number minus 1)
			num--;    
			
		// Logical operators (equality and relational)
		   int number=3;
		   int number2=5;
		   if (number==3){System.out.println( "The number is three " );}  // Use '==' for equal to (number)   
		   if (number!=2){System.out.println( "The number is not two");}  // Use '!=' for not equal to (number)
		   // Equality in Strings?
		   
		/*
		   System.out.println(number==number2); // It returns a boolean object [False]
		   System.out.println(number>number2);  // Greater than (>)[False]
		   System.out.println(number<number2);  // Less than (<) [True]
		*/ 
		
		// Logical operators (or/and)
		   boolean variable=true;
		   boolean variable2=false;
		 /*
		   System.out.println("variable && variable2 is "+(variable&&variable2));   // AND True+False   = False, It includes two variables 
		   System.out.println("variable || variable2 is "+(variable || variable2)); // OR True or False = True, Only one variable is needed
		   System.out.println("! variable"+ (!variable)); 							//It inverts the value of boolean [True-->False]
		 */
		   
		   
	}	//End 	
}
	
	

	


		

	

