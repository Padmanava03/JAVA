abstract class Animal{
	
	void speak() {
		System.out.println("The animal goes *speak*");
	}
	abstract void activity();
	
}

class Dog extends Animal{
	
	@Override
	void activity() {
		System.out.println("The dog goes *wiggle its tail*");
	}
	
}

public class Exp8 {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.speak();
		dog.activity();
	}

}
