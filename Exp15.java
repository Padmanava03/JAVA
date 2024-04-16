import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exp15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the below informations correctly :");
			FileWriter writer = new FileWriter("Application.txt");
			System.out.print("Name : ");
			writer.write("Name : "+sc.nextLine());
			System.out.print("Age : ");
			writer.write("\nAge : "+sc.nextInt());
			sc.nextLine();
			System.out.print("Quealification : ");
			writer.write("\nQualification : "+sc.nextLine());
			System.out.print("Address : ");
			writer.write("\nAddress : "+sc.nextLine());
			writer.close();
			File file = new File("Application.txt");
			System.out.println("Your are detailes are stored in "+file.getAbsolutePath());
		} catch (IOException e) {		
			e.printStackTrace();
		}
		sc.close();
	}

}
