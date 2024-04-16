@SuppressWarnings("serial")
class AgeException extends Exception{
	
	AgeException(String message){
		super(message);
	}
	
}

public class Exp10 {
	
	static void CheckAge(int age)throws AgeException{
		if(age<0) {
			throw new AgeException("Age cannot be negative!");
		}else if(age<18) {
			throw new AgeException("You are not eligible to cast a vote!");
		}else {
			System.out.println("Congrats! you can now cast your vote!");
		}
	}

	public static void main(String[] args) {
		int age = 7;
		try {
			CheckAge(age);
		}catch(AgeException e) {
			System.out.println(e.getMessage());
		}
	}

}
