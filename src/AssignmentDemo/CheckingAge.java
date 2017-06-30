package AssignmentDemo;

import java.io.NotActiveException;
import java.util.Scanner;

public class CheckingAge {
	public void test(int age) throws NotEligibleToVoteException {
		// here we applying the try block
		try {
			// here we applying the if statement
			if (age > 18) {

				System.out.println("eligible");

			} else {
				// here it will throw statement
				throw new NotEligibleToVoteException(age);

			}

		}
		// here we applying the catch exception
		catch (Exception e) {
			// here we print the statement
			System.out.println("Exeption---->" + e);
		}
	}

	// here we are created the amin method
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		// here we created the scanner to take the input from the user
		Scanner sc = new Scanner(System.in);
		// here we enter the age of voter with the help of scanner
		System.out.println("Enter the age of voter:");
		// here we are Declaring a variable age
		int age = sc.nextInt();
		// here we are Making object of CheckAge class
		CheckingAge ta = new CheckingAge();
		try{
		ta.test(age);
	}
	 catch (NotEligibleToVoteException e){
		e.printStackTrace();
		e.toString();
	}
	}
}

		
		
