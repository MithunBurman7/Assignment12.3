package AssignmentDemo;

public class NotEligibleToVoteException extends Exception {
   int age;
   // here we making a constructor
	public NotEligibleToVoteException(int age) {
		// TODO Auto-generated constructor stub
       
		this.age = age;
	
	}

	public String toString(){
		
	  return "your age is" + age + " You must be 18+";
      
	}

}
