import java.util.InputMismatchException;
import java.util.Scanner;

public class Exp18 {

	static double Calculate(double m, double n, char op) throws ArithmeticException{
		switch(op) {
		case '+':
			return m+n;
		case '-':
			return m-n;
		case '/':
			if(n==0) {
				throw new ArithmeticException("Division by 0 is a SERIOUS CRIME!");
			}
			return m/n;
		case '*':
			return m*n;
		default:
			return Double.NaN;
		}
	}
	
	public static void main(String[] args) {
		double num1, num2;
		char operator;
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("Enter a number = ");
				num1 = sc.nextDouble();
				sc.nextLine();
				break;
			}catch(InputMismatchException e) {
				System.out.println("Please enter a number!");
				sc.nextLine();
			}
		}
		while(true) {
			try {
				System.out.print("Enter an operator(+, -, /, *) : ");
				operator = sc.nextLine().charAt(0);
				if(operator=='+' || operator=='-' || operator=='/' || operator=='*')
					break;
			}catch(InputMismatchException e) {
				System.out.println("Please enter any of mentioned operators!");
			}
		}
		while(true) {
			try {
				System.out.print("Enter a number = ");
				num2 = sc.nextDouble();
				break;
			}catch(InputMismatchException e) {
				System.out.println("Please enter a number!");
				sc.nextLine();
			}
		}
		try {
			System.out.printf("%.2f\n",Calculate(num1, num2, operator));
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
