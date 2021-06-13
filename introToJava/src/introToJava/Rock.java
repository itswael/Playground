package introToJava;

import java.util.Random;
import java.util.Scanner;

public class Rock {
	public static void main(String[] args) 
	{ 
	 String personPlay; //User's play -- "R", "P", or "S"
	 String computerPlay = "R"; //Computer's play -- "R", "P", or "S"
	int computerInt1; //Randomly generated number used to determine
	//computer's play
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter Customer Play");
	 personPlay = scan.nextLine().toUpperCase();
	 scan.close();
	Random generator = new Random();
	 computerInt1 = generator.nextInt(3);
	//Get player's play -- note that this is stored as a string
	//Make player's play upper case for ease of comparison
	//Generate computer's play (0,1,2)
	//Translate computer's randomly generated play to string
	switch (computerInt1) 
	 {
	case 0:
		computerPlay = "R";
		break;
	case 1:
		computerPlay = "P";
		break;
	case 2:
		computerPlay = "S";
		break;
	 } 
	//Print computer's play
	System.out.println("computer's play is "+ computerPlay);
	//See who won. Use nested if's instead of &&.
	 if (personPlay.equals(computerPlay)) 
	 System.out.println("It's a tie!"); 
	 else if (personPlay.equals("R")) {
		 if (computerPlay.equals("S")) 
			 System.out.println("Rock crushes scissors. You win!!"); 
		 else { 
			 // ... Fill in rest of code
			 System.out.println("Rock Trapped in paper, computer wins!!");
			 }
		 }
	 else if (personPlay.equals("P")) {
		 if (computerPlay.equals("S")) 
			 System.out.println("scissors cut paper. Computer wins!!"); 
		 else { 
			 // ... Fill in rest of code
			 System.out.println("Rock Trapped in paper, You win!!");
			 }
		 }
	 else if (personPlay.equals("S")) {
		 if (computerPlay.equals("P")) 
			 System.out.println("scissors cut paper. You win!!"); 
		 else { 
			 // ... Fill in rest of code
			 System.out.println("Rock crushes scissors. Computer wins!!");
			 }
		 }
	 }
}
