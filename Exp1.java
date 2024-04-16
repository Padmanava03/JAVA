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

public class Exp1 {

	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		System.out.println("Number of wheels = "+vehicle.wheels);
		System.out.println("Colour of vehicle = "+vehicle.colour);
		vehicle.start();
		vehicle.stop();
	}

}
