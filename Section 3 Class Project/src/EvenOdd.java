// Devon Andersen
/*
 * Create a program that will take user input. For every number entered in by the user, print the number and
 * a short description if it is even or odd.
 * 
 * Sample Format:
 * 
 * You entered in {x} and it is {odd|event}.
 */
import java.util.Scanner;

public class EvenOdd {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("Enter a number: ");
		int num = Integer.parseInt(in.nextLine());
		
		if (num%2 == 0){
			System.out.println("You entered in " + num + " and it is even.");}
		else {
			System.out.println("You entered in " + num + " and it is odd.");}
		
		in.close();
		
	}
}