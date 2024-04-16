package PackageA;

public class A {

	String message1 = "Default messgae";
	public String message2 = "Public message";
	protected String message3 = "Protected message";
	private String message4 = "Private message";
	
	public static void main(String[] args) {
		System.out.println(new A().message4);
	}

}
