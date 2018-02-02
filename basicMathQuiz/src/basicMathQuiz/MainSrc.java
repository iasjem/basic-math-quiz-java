/**
 * This is a simple basic Math quiz app that will compute two numbers to 
 * different kinds of operators (from Addition to Division) randomly. Numbers
 * randomly generated are from 0 to 10 only since this is only Basic Integer Math.
 * All answers with decimal output are to be rounded off to nearest tenths to
 * get a whole number. App uses the concept of Scanner, Randomness and
 * Conditional Statements.
 */

package basicMathQuiz;
import java.util.*;

public class MainSrc {

	public static void main(String[] args) {
		
		int a,b,c=0; // c is total of a and b
		int ansUser; // get answer from User
		int i; // let's just say, its the operator to be used
		
		Scanner askUser = new Scanner(System.in);
		Random randomNumber = new Random();
		Random randomOperator = new Random();
		
		a=randomNumber.nextInt(11);
		b=randomNumber.nextInt(11);
		
		i = randomOperator.nextInt(4); // randomize operation if addition, etc..
	
			if(i == 0) { // addition
				c=a+b;
				System.out.println(a + " + " + b + " = ?");
			} else if (i== 1){ // subtraction
				c=a-b;
				System.out.println(a + " - " + b + " = ?");
			} else if (i == 2) { // multiplication
				c=a*b;
				System.out.println(a + " x " + b + " = ?");
			} else if (i==3){ // division
				if (a >=b) { // since we only focus on integers, round off if 
					// c is a decimal number
					c=Math.round(a/b);
					System.out.println(a + " / " + b + " = ?");
				} else { // because we cannot divide a by 0
					c=Math.round(b/a);
					System.out.println(b + " / " + a + " = ?");
				}
			}
				
		// User should answer correctly or else, they will fail the test!
		
		ansUser = askUser.nextInt(); // get the answer from user
		
		if(ansUser == c) {
			System.out.println("That's correct!");
		} else {
			System.out.println("Wrong! The answer is " + c + ". Better luck next time!");
		}
		
		askUser.close();
		System.exit(0);
		// Hope you like it! :)
	}

}
