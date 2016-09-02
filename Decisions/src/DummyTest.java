import java.util.Scanner;
public class DummyTest {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.print("Enter number");
		String numStr = in.nextLine();
		String message = null;
		
		if (numStr == "asdf"){message = "You typed asdf";}
		else if(numStr.equals("ASDF")){message = "You typed ASDF";}
		else{message = "You typed something unreadable";}
		
		System.out.println(message);
	}

}
