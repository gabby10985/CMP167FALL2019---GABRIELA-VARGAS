/*
 * Author: Gabriela Vargas
 * Desc: Welcome 
 * */
import java.util.Scanner;
public class welcome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String welcome = "Welcome to Java";
		
		System.out.println(welcome);
	
		System.out.println("What is your name? I'm a computer");
		String name=input.nextLine();
		
		System.out.println("Nice to meet you, " +name+ "!");
		
		//System.out.println("Welcome to Lehman College");

	}

}
