// Devon Andersen
import java.util.Scanner;

public class RegularExpressions {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		// String .matches({regex}) - returns boolean
		
		// Match a hexidecimal color code
		// ^#([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$
		
		String pattern = "^#([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$";
		String code = "#affadd";
		
		if (code.matches(pattern)){
			System.out.println("Valid hexidecimal color code.");
		}
		
		
		
		// Create a username
		// No spaces, first letter of firstname, entire lastname, all lowercase, less than 20 characters
		// create email address {username}@example.org
		
		
		System.out.println("Enter first name: ");
		String fn = in.nextLine();
		System.out.println("Enter last name: ");
		String ln = in.nextLine();
		
		ln = ln.replaceAll(" ", "");
		String fnLetter = Character.toString(fn.toCharArray()[0]);
		String fnLetter2 = fn.substring(0, 1);
		
		String username = (fnLetter2 + ln).toLowerCase().trim();
		String email = username + "@example.org";
		
		String spacePattern = "^[a-z]{1,20}$";
		if(!username.matches(spacePattern)){
			username = username.substring(0, 19);
		}
		System.out.println(username + " is valid");
		in.close();
	}

}
