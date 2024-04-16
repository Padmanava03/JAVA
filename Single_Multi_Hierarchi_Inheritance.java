class Vehicle{
	
	int wheels = 4;
	String colour = "Red";
	
	void start() {
		System.out.println("The vehicle is moving!");
	}
	
	void stop() {
		System.out.println("The isn't moving!");
	}
}

class Car extends Vehicle{
	
	int wheels = 4;
	int doors = 4;

}

class Porsche extends Car{
	
	String colour = "Blue";
	String Model = "911 GTR";
	
}

class AutoRickshaw extends Vehicle{
	
	int wheels = 3;
	int doors = 0;
	
}

public class Exp2 {

	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("Colour of car = "+car.colour);
		Porsche porsche = new Porsche();
		System.out.println("Model of Porsche = "+porsche.Model);
		AutoRickshaw autoRickshaw = new AutoRickshaw();
		System.out.println("Doors in auto-rickshaw = "+autoRickshaw.doors);
	}

}
