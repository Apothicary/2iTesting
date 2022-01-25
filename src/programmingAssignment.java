import java.util.Scanner;

public class programmingAssignment {

	public static void main(String[] args) {
		
		// This will get the input of the A and X variables from the user via Scanner
		 Scanner userInput = new Scanner(System.in);
		 System.out.println("Please enter the value of A: ");
		 int A = userInput.nextInt();
		 System.out.println("Please enter the value of X: ");
		 int X = userInput.nextInt();
		 
		 //This is the For Loop of the multiples of A until X
		    for (int b=1; b<=X;++b) {
		      System.out.println(A + " * " + b + " = " + A * b);
		    }
		  //This is the For Loop of the multiples of A + 1 until 2X
		    for (int c=1; c<=X*2;++c) {
		     	System.out.println("(" + A + " + 1)" + "*" + c + " = " + ((A +1)*c));
		    }
		    
		  //This is the For Loop of the multiples of A+2 until 3X
	        for (int d=1; d<=X*3;++d) {
		    	System.out.println("(" + A + " + 2)" + "*" + d + " = " + ((A +2)*d));
		    }
		    
		  //This closes the Scanner
		    userInput.close(); 
	}
}
