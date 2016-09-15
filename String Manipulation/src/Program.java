
public class Program {
	public static void main(String[] args){
		// Character functions
		
/*		
 * 		BOOLEAN checks on a Character
 * 		-----------------------------
 * 		Character.isDigit(ch)  | 0 - 9
		Character.isLetter(ch)  | a-zA-Z
		Character.isUpperCase(ch)  |  works only on letters
		Character.isLowerCase(ch)  |  works only on letters
		Character.isWhitespace(ch)  | \r  \n  ' '  \t
		
		
		Character.toUpperCase(ch)  | uppercase a letter and return it (char)
		Character.toLowerCase(ch)  | lowercase a letter and return it (char)
		Character.toString(c)  | converts a character to a string
		*/
		
		// String functions
		String name = "Devon Andersen";
		// name.substring(beginIndex, endIndex)  | returns part of a string
		// name.toUpperCase() | returns an uppercase string
		// name.toLowerCase() | returns a lowercase string
		// name.length() | human readable (starts at 1) length of the string, returns int
		// name.split(" ") | delimiter - returns array of strings
			// Common delimiters ,  \t  |
			// ,  \t - CSV       | - pipe delimiter
		// name.toCharArray()  | string into character array
		
		
		
		
		/*
		 * Regular Expression  (String pattern matching)
		 * ----------------------------------------------
		 * \d - digit
		 * \D - non digit
		 * \w - word character a-zA-Z
		 * \W - non word character
		 * \s - space character
		 * \S - non space character
		 * 
		 * ^ - Starts with
		 * $ - ends with
		 * 
		 * 
		 * Quantifiers
		 * . - 0 or more - anything else  ^d.$
		 * + - 1 or more 
		 * {x} - must match x number of times
		 * {x, y} - must match x, y number of times only
		 * {x,} - must match minimum of x number of times to unlimited
		 * 
		 * 
		 * Sets
		 * [abcdef0123456789] - set match (true if any character in set matches)
		 * [^ghik] - not set match (can't be in set)
		 * () - grouping
		 * | - or statement
		 */
		
		
		
		// You are writing a web browser
		// Needs to match hesadecimal color codes
			// <p style="color:#ffffff"></p>
		// ^#([0-9a-fA-f]{3})|[0-9a-fA-F]{6}$
		
		
		// validate a uri
		// ^http[s]{0,1}://.\.(com|net|gov)$
		
		// Donald Duck, Damon Drake, Fred Flintstone
		// check for proper name assuming 1 first and 1 last
		// ^[A-Z]{1}\w+\s{1}[A-Z]{1}\w+$
		
		
		// Course Code
		// CPD 222 A  (6 * char(5) = char(30))
		// 'CPD  222  A                   ' - 30 bytes * 22,800
		// ^[A-Z ]{5}[0-9 ]{5}[0-9A-Z ]{5}\s{15}$
		
		
		
		
		
		
		
	}
}
