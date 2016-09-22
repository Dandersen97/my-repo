import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Create a program to analyze a sentence a user puts in.
 * 
 * Use regular expressions to make sure the sentence is valid:
 * 	1.) Begins with a capital letter
 * 	2.) Ends with the following punctuation (.?)
 * 
 * 		- Print out the sentence length
 * 		- Print out the word count for the sentence
 * 		- Print out each word in the sentence excluding associated punctuation
 * 
 * 		- Extra Credit (20 points)
 * 		- Print out how many times a letter was used in the sentence
 */

public class SentenceAnalyzer {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a sentence: ");
		String snt = in.nextLine();
		
		String pattern = "^[A-Z]{1}[a-zA-Z\', ]{0,}[\\.?]$";
		String pattern2 = "^[a-zA-Z\', ]{0,}[\\.?]$";
		
		if (snt.matches(pattern)){
			System.out.println("There are " + snt.length() + " letters in this sentence.");
			
			
			String[] words = snt.split(" ");
			int wordCount = 0;
			for(String w : words){
				wordCount = wordCount + 1;
				
				if( w.matches(pattern2)){
					String newStr = w.replace(".", "");
					System.out.println(newStr);
					break;
					}

				System.out.println(w);	
			}
			System.out.println("There are " + wordCount + " words in the sentence.");
		}
		else{
			System.out.println("Bad Sentence");}
		
	}

}