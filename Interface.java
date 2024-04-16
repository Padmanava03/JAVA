interface Prey{
	
	void flee();
	
}

interface Predator{
	
	void hunt();
	
}

class Hawk implements Predator{

	@Override
	public void hunt() {
		System.out.println("The hawk is hunting rabbits!");
	}
	
}

class Rabbit implements Prey {

	@Override
	public void flee() {
		System.out.println("The rabbits are feeling from hawk's attack!");
	}
	
}

class Fish implements Prey, Predator{

	@Override
	public void hunt() {
		System.out.println("Big fish are hunting the small fish!");
	}

	@Override
	public void flee() {
		System.out.println("Small fishes are fleeing from big fish!");
	}
	
}

public class Exp9 {

	public static void main(String[] args) {
		Hawk hawk = new Hawk();
		hawk.hunt();
		Rabbit rabbit = new Rabbit();
		rabbit.flee();
		Fish fish = new Fish();
		fish.hunt();
		fish.flee();
	}

}
