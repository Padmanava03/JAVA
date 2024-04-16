class Bank{
	
	double RI = 1.2;
	double getRateOfInterest() {
		return RI;
	}
	
}

class SBI extends Bank{
	
	double RI = 1.53;
	double getRateOfInterest() {
		return RI;
	}
	
}

class ICIC extends Bank{
	
	double RI = 2.33;
	double getRateOfInterest() {
		return RI;
	}
	
}

class AXIS extends Bank{
	
	double RI = 1.65;
	double getRateOfInterest() {
		return RI;
	}
	
}

public class Exp4 {

	public static void main(String[] args) {
		Bank bank;
		System.out.println("Rate of Interest of several banks are:");
		bank = new SBI();
		System.out.println("SBI  = "+bank.getRateOfInterest()+"%");
		bank = new ICIC();
		System.out.println("ICIC = "+bank.getRateOfInterest()+"%");
		bank = new AXIS();
		System.out.println("AXIS = "+bank.getRateOfInterest()+"%");
	}

}
