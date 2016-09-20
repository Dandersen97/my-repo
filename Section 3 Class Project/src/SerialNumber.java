import java.util.Scanner;

public class SerialNumber {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {		
		String pattern = "^(DA|MM|VG)-[0-9]{10}-[0-9A-G]{3}|(DA|MM|VG)-[0-9]{10}-[0-9A-G]{4}$";
				
		System.out.print("Enter a serial number: ");
		String code = in.nextLine();
				
		if (code.toUpperCase().matches(pattern)){
			System.out.println("Valid code.");}
		else{
			System.out.println("Invalid code.");}
				
		in.close();

	}

}
