import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		
		List<Integer> num = new ArrayList<Integer>();
		
		
		do{
		int rndNum = rnd.nextInt(100) + 1;
		
		if(!num.contains(rndNum)){
			num.add(rndNum);
			
			if(rndNum > 0 && rndNum <=15){System.out.println("B" + rndNum);}
			else if(rndNum > 15 && rndNum <=30){System.out.println("I" + rndNum);}
			else if(rndNum > 30 && rndNum <=45){System.out.println("N" + rndNum);}
			else if(rndNum > 45 && rndNum <=60){System.out.println("G" + rndNum);}
			else if(rndNum > 60 && rndNum <=75){System.out.println("O" + rndNum);}	
		}
		}
		while(num.size() < 10);
		
		in.close();
	}

}
