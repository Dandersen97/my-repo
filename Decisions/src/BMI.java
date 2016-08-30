// Devon Andersen
/*
	The body mass index (BMI) is commonly used by health and nutrition professionals to estimate 
	human body fat in populations.  You will need to prompt the user for their weight and height. 
	It is computed by taking the individual's weight (mass) in kilograms and dividing it by the 
	square of their height in meters.
	
	Use the 4 categories below to to determine the output.
	
	BMI				Category
	-----------------------------------
	< 18.5			Under Weight
	18.5 - 24.9		Normal
	25.0 - 29.9		Overweight
	30.0 or more	Obese
	-----------------------------------
 */

import java.util.Scanner;
public class BMI {
public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	//TODO Prompt for person's height in meters
	//TODO Prompt for person's weight in kilograms
	//TODO Calculate the person's BMI
	//TODO Determine which category the person belongs to
	//TODO Print out BMI and Category

	System.out.print("Enter your height in meters: ");
	String height = scanner.nextLine();
	System.out.print("Enter your weight in kilograms: ");
	String weight = scanner.nextLine();
	
	double bmi = Double.parseDouble(weight)  / (Double.parseDouble(height) * Double.parseDouble(height));
	
	System.out.println("Your BMI is: " + bmi);	
	if (bmi < 18.5){
		System.out.println("Underweight");
	}
	else if (bmi >= 18.5 && bmi < 25.0){
		System.out.println("Normal");
	}
	else if (bmi >= 25.0 && bmi < 30.0){
		System.out.println("Overweight");
	}
	else{
		System.out.println("Obese");
	}
	

	}
}