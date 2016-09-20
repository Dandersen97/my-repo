// Devon Andersen
/*
 * Print out numbers from 1 up to and including 100. For numbers that are multiples of 3 write the word "Fizz".
 * For numbers that are multiples of 5 write the word "Buzz". For numbers that are both multiples 3 and 5
 * write the word "FizzBuzz"
 * 
 * Sample Print Out:
 * 
 * 1
 * 2
 * 3 Fizz
 * 4
 * 5 Buzz
 * 6 Fizz
 * 7
 * 8
 * 9 Fizz
 * 10 Buzz
 * 11
 * 12 Fizz
 * 13
 * 14
 * 15 FizzBuzz
 * 
 */

public class FizzBuzz {
	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++){
			if (i%3 == 0 && i%5 == 0){
				System.out.println(i + " FizzBuzz");}
			else if (i%3 == 0){
				System.out.println(i + " Fizz");}
			else if (i%5 == 0){
				System.out.println(i + " Buzz");}
			else{
						System.out.println(i);}
		
		}
		
	}
}
