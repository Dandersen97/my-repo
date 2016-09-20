// Devon Andersen
/*
 * Using regular expressions and string.matches() create a program to validate
 * html color codes.
 * 
 * Valid Color Codes:
 * #fffaaa
 * #ffa
 * #9900bb
 */
import java.util.Scanner;

public class HtmlColorValidator {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// Match a hexidecimal color code
		// ^#([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$
		
		String pattern = "^#([0-9a-fA-F]{3}|[0-9a-fA-F]{6})$";
		
		System.out.print("Enter a hexidecimal color code: ");
		String code = in.nextLine();
		
		if (code.matches(pattern)){
			System.out.println("Valid code.");}
		
		in.close();
	}
}