import java.util.Scanner;

public class Exp6 {
	
	int top=-1;
	int len;
	int stack[];
	
	Exp6(int len){
		this.len = len;
		stack = new int[len];
	}
	
	boolean isEmpty() {
		return top==-1 || top>len-1;
	}
	
	boolean isFull() {
		return top==len-1;
	}
	
	void push(int element) {
		if(isFull()) {
			System.out.println("Stack is overflown!");
			System.exit(1);
		}
		stack[++top]=element;
	}
	
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack is underflown!");
			System.exit(1);
		}
		return stack[top--];
	}
	
	int peek() {
		if(isEmpty()) {
			System.out.println("Stack is underflown!");
			System.exit(1);
		}
		return stack[top];
	}
	
	void disp() {
		if(isEmpty()) {
			System.out.println("Stack is underflown!");
			System.exit(1);
		}
		for(int i=top; i>-1;i--) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Exp6 Stack = new Exp6(10);
		while(true) {
			System.out.println("Options");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			System.out.print("--> ");
			int c = sc.nextInt();
			switch(c) {
			case 1:
				System.out.print("Enter an element = ");
				int e = sc.nextInt();
				Stack.push(e);
				break;
			case 2:
				System.out.println(Stack.pop()+" is popped out!");
				break;
			case 3:
				System.out.println("Element at the top is "+Stack.peek());
				break;
			case 4:
				System.out.println("Elements in the stack are:");
				Stack.disp();
				break;
			case 5:
				System.out.println("Thank you :)");
				sc.close();
				System.exit(0);
			}
		}
	}

}
