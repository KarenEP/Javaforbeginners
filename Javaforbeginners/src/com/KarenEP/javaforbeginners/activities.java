package com.KarenEP.javaforbeginners;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class activities {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Simple game to test some concepts 
		   InputStreamReader isr = new InputStreamReader(System.in);  // Read keyboard
		   BufferedReader br = new BufferedReader (isr);
		   boolean end=true;
		   
		   System.out.println("Imagine you are in a room and you want to escape. But you have to pass some test");
		   
		   while (end){
			  boolean firstButton=true, secondButton=false, endButton=true;
			 
			   
				   System.out.println("You have three colors : "+"blue = 1 "+"yellow = 2 "+"red = 3");
				   System.out.println("You have to make orange "+"Choose two colors");
				   
				   int firstColor = Integer.parseInt (br.readLine());
				   System.out.println("Put the second color");
				   int secondColor = Integer.parseInt (br.readLine());
				   
				   if ((firstColor==3&&secondColor==2)||(firstColor==2&&secondColor==3)){ 									
					   System.out.println("Well done. You made orange ");
					 
					    while(end){
					     System.out.println("You have two buttons, when you press one you can open or close a door");
						 System.out.println("You need to open two doors. Try pressing some button. Click 1=First button 2=Second button");
						 int pressButton = Integer.parseInt (br.readLine());
						 	switch(pressButton){
							 	case 1: firstButton=!firstButton; break;
							 	case 2: secondButton=!secondButton; break;
						 	}
							 if(firstButton){System.out.println("The second door is open");}	
							 if(firstButton==false){System.out.println("The second door is close");}
							 
							 if (secondButton){System.out.println("The first door is open");}	
							 if(secondButton==false){System.out.println("The first door is close");}
							 
							 System.out.println(" ");
							 
							 if(firstButton&&secondButton){
								 System.out.println("You did it. Now you can escape");
								 while(end){
									 System.out.println("Now, you are in the forest, there is a wild Pokemon you need to fight.");
									 System.out.println("You have 3 pokeballs with three Pokemons, choose the best one");
									 pressButton = Integer.parseInt (br.readLine());
									 switch(pressButton){
									 	case 1: System.out.println("You find a Rattata, quite bad, it bites you, Auugh!");
									 			System.out.println("Try again");
									 			System.out.println(" "); break;
									 	case 2: System.out.println("You find a Charmander, it is strong, it fights and wins the battle");
									 			System.out.println("You are the best you win the game!!!");
									 			end=false;break;
									 	case 3: System.out.println("You find a Pidgey, it flies really high, Bye bye! ");
									 			System.out.println("Try again");
							 					System.out.println(" ");;break;
								 	}
								 }
								 endButton=false; end=false;}
					    }
				   }
				   else {System.out.println("Try again.");}
			   
				   
				   
				   /*
				   
			//Copy 	   
			   System.out.println(" ");
			   
			   System.out.println ("Imagine you have two bottons and you need to open a door");
			   System.out.println("When you press the button it turns on a light. Try to open the door by pressing buttons");
			   boolean condition1=false, condition2=true;
			   System.out.println ("Click: 1 = ON  2=OFF"); 

			   
			   while(end==false){
				   System.out.println("Click the first button");
				   int button1 = Integer.parseInt (br.readLine());
				   if(button1==1){condition1=true;}
				   else if (button1==2){condition1=false;}
				   
				   System.out.println("Click the second button");
				   int button2 = Integer.parseInt (br.readLine());
				   if(button2==1){condition2=true;}
				   else if(button2==2){condition2=false;}
				   
				   if (condition1&&condition2){
					   System.out.println("You open the door");   // You can only open the door if both are true
					   while(end==false){
						   System.out.println("You are in a new room with two boxes");
						   System.out.println ("Click: 1 = Open  2= Close"); 
						   
						   System.out.println("Click on the first box");
						   int box1 = Integer.parseInt (br.readLine());
						   if(box1==1){condition1=true;}
						   else if (box1==2){condition1=false;}
						   
						   System.out.println("Click on the second box");
						   int box2 = Integer.parseInt (br.readLine());
						   if(box2==1){condition2=true;}
						   else if(box2==2){condition2=false;}
						   
						   if(!(condition1||condition2)){
							   System.out.println("You win a Pikachu");
							   end=true;}
						   else {System.out.println("Try again");}
						   
					   }
					   
				   }
				   
				   else {System.out.println("The door is close");}
				   
				  
				    }
				   */
				   
			   
		   }
	} //End

}
