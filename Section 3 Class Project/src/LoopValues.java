import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Devon Andersen
/*
 * Create a program that receives integers from the user and keeps a running total of the integers.
 * When the user enters in 0 stop the loop and then display the total. 
 */

public class LoopValues {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num = 0;
		List<Integer> numbers = new ArrayList<Integer>();
		
		do{
			System.out.print("Enter a number: ");
			num = Integer.parseInt(in.nextLine());
			numbers.add(num);
		}
		while(num != 0);
		
		
		int totalNum = 0;
		for (int t : numbers){
			totalNum = totalNum + t;}
		
		
		System.out.println("The total value of all numbers entered is: " + totalNum);
		in.close();

	}
}