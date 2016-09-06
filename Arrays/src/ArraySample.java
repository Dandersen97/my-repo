import java.util.Scanner;
import java.util.List; //working with Collections
import java.util.ArrayList; //working with Collections
import java.util.Arrays;

public class ArraySample {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		// Array
		// A collection of like data types
		// 1.) Must initialize / set number of elements. (Once set, can't change number of elements)
		
		String str1 = "A";
		String str2 = "B";
		String str3 = "C";
		
		String[] strSet = new String[3]; // Set an array to contain 3 elements
		String[] strSet2 = new String[] { str1, str2, str3, "Devon"}; // Initialize with values
		
		System.out.println(strSet.length); //Length gets the number of elements in an array
		
		strSet2[3] = "D"; //Assign D where Devon was
		System.out.println(strSet2[3]);
		
		
		
		
		// List<T>
		// 1.) Add and Remove objects (resize backing array)
		// List <of type> name = new ArrayList <of type>();
		List<String> names = new ArrayList<String>();
		names.add("Devon"); // adds and item at the end of the array
		names.remove("Devon"); // removes an item with the value "Devon" (first occurrence)
		
		names.contains("Dog"); //returns a boolean values
		names.size(); // tells the number of elements in the list  -- simular to array.length
		names.get(2); // gets index 2 from the array (0 index based)
		names.clear(); // Clear out all values / size
		names.toArray(); // returns backing array
		
		
		
		
		
		
		// Do until
		// 1.) Post Test loop
		// 2.) Generic all purpose loop
		String name2 = "Dog";
		do{ System.out.println("Enter a name: ");
			name2 = in.nextLine();}
		while ( name2.length() == 0 );
		
		// While loop
		// 1.) Pre Test loop
		// 2.) Generic all purpose loop
		while ( name2.length() < 3  ){
			System.out.println("Enter a name: ");
			name2 = in.nextLine();
		};
		
		// for loop
		// 1.) Used for incremental stepping
		// 2.) ({ loop variable } ; { condition } ; { stepping value })
		// 3.) Set number of times, accumulate, dealing with an array by index
		//for (x; s; t){  };
		for (int x = 0; x < name2.length(); x++){
			System.out.println(x+ 1);
		}
		
		// for each loop
		// 1.) Arrays and Collections by value
		//for (x : z) {   };
		for (char c : names){
			System.out.println(c);
		}
		
		
		
		
		
		
		String setence = "The quick brown fox jumps over the lazy dog.";
		char[] characters = setence.toCharArray();
		// Count number of spaces
		int spaceCount = 0;
		int vowelCount = 0;
		List<String> vowels = new ArrayList<String>(Arrays.asList(new String[]{"a", "e", "i", "o", "u"})) ;     //;
		for (char c : characters){
			if (c == ' '){spaceCount++;}
			
			if (vowels.contains(Character.toString(c).toLowerCase())){vowelCount++;}
			//if (c == 'a' || c == 'A'){vowelCount++;}
			//if (c == 'e' || c == 'E'){vowelCount++;}
			//if (c == 'i' || c == 'I'){vowelCount++;}
			//if (c == 'o' || c == 'O'){vowelCount++;}
			//if (c == 'u' || c == 'U'){vowelCount++;}
		}
		System.out.println(spaceCount);
		System.out.println("Vowels: " + vowelCount);
		
		
		
		
	}

}
