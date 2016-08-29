
public class Program {

	public static void main(String[] args) {
		
		int x = 3;
		int y = 5;
		int z = 18;
		
		String dog = "Bulldog";
		String dog2 = "Beagle";
		String dog3 = "beagle";
		
		//if (condition) { body } else if (condition) { body } else { body }
		// if (x=5) is error, if (x == 5) right syntax
		if (x > y) {
			
		}
		else if (y < x) {
			
		}
		else {
			
		}
		
		// String.equals() for string equality
		if (dog2 == dog3){ // NOT THIS
			System.out.println("Same dog");
		}
		
		if (dog2.equals(dog3)){
			//asfd
		}
		
		
		//Compound if statement
		// || or, && and
		if ((y == 5) && x == 3 || x ==5){
		}
		
		
		// Conditional if
		// (x >= 1) ? {true} : {false}
		z = (x >= 1) ? x = y : 0;
		
		if (x >=1){
			z = x + y;
		}
		else{
			z = 0;
		}
		
		
		
		//switch { case statement} char / int
		// switch (x) {case:, default: }
		// end each case with break; -- break ends entire switch statement
		switch (x) {
			case 5:
				System.out.println("x is 5");
				break;
			case 4:
			case 3:
			case 2:
				System.out.println("X is 2,3, or 4");
				break;
			case 1:
				System.out.println("x is 1");
			default:		
				System.out.println("no clue what x is");
		}
		
		// ASCII -- ISO-8995 || Only applies to English Characters
		// UTF-8 -- Unicode || { Support multiple languages }
		char letter = 'A';
		char letter2 = '\u0065';
		
		if (letter == 65){
			System.out.println("This is uppercase A");
		}
		
		
		
		
	}
		
		
		// functions / methods
		// function/method header signature
		
		// access modifiers { private, public, protected, final, static }
			// private only accessible in its scope
			// public accessible everywhere
			// protected publicly accessible one in its package
			// final = const
		
		// Compiler signature view
			//public static void checking(String)
		public static void checking(String n) { }
			//public static void checking(String, String)
		public static void checking(String n, String l) { }
			//public static void checking(String, int)
		public static void checking(String n, int x) {
			if (x == 3) {return:}
		}
		
		public static String fullName(String fn, String ln){
			if (ln.startsWith("D")){ return ""; }
			return String.format("%s %s", fn, ln);
		}
		
		
		
	

}
