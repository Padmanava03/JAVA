public class Exp5 {
	
	double volume;
	
	Exp5(double x){
		this.volume = x*x*x;
	}
	
	Exp5(double x, double y){
		this.volume = Math.pow(x, 2)*y;
	}
	
	Exp5(double x, double y, double z){
		this.volume = x*y*z;
	}

	public static void main(String[] args) {
		Exp5 cube = new Exp5(2.1);
		System.out.printf("Volume of cube is %.2f units cube\n",cube.volume);
		Exp5 cuboid = new Exp5(3.2, 5, 6);
		System.out.printf("Volume of cuboid is %.2f units cube\n",cuboid.volume);
		Exp5 cylinder = new Exp5(2.5, 4.6);
		System.out.printf("Volume of cylinder is %.2f units cube\n",Math.PI*cylinder.volume);
		Exp5 cone = new Exp5(2, 5.7);
		System.out.printf("Volume of cone is %.2f units cube\n",Math.PI*cone.volume/3);
		Exp5 sphere = new Exp5(3.4);
		System.out.printf("Volume of sphere is %.2f units cube\n",Math.PI*sphere.volume*4/3);
		Exp5 hemiSphere = new Exp5(2.9);
		System.out.printf("Volume of hemi-sphere is %.2f units cube\n",Math.PI*hemiSphere.volume*2/3);
	}

}
