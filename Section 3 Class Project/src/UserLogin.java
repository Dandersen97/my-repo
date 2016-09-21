import java.util.Scanner;

/*
 * Create a program that allows the user to input their first and last name. Use the information gathered to create
 * a username with the following criteria:
 * 
 * 1.) must be all lowercase
 * 2.) can't contain spaces
 * 3.) must be less than 20 characters
 * 4.) should use the first letter of the first name and the entire last name if possible.
 * 
 * Sample:
 * Fred Flintstone = fflintstone
 * Donald Duck = dduck
 * 
 */
public class UserLogin {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter your first name: ");
		String fn = in.nextLine();
		System.out.print("Enter your last name: ");
		String ln = in.nextLine();
		
		
		ln = ln.replaceAll(" ", "");
		String fnLetter = fn.substring(0, 1);
		
		String username = (fnLetter + ln).toLowerCase().trim();
		
		String spacePattern = "^[a-z]{1,20}$";
		if(!username.matches(spacePattern)){
			username = username.substring(0, 19);}
		
		System.out.println(username);
	}
}