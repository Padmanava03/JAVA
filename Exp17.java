class Doggo{
	
	private String name;
	private int age;
	
	Doggo(String name, int age){
		this.setName(name);
		this.setAge(age);
	}
	
	String getName() {
		return name;
	}
	
	int getAge() {
		return age;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
}
public class Exp17 {

	public static void main(String[] args) {
		Doggo doggo = new Doggo("Sheru",3);
		System.out.println(doggo.getName()+" is "+doggo.getAge()+" years old!");
		doggo.setAge(4);
		System.out.println(doggo.getName()+" turned "+doggo.getAge()+" years today!");
	}

}
