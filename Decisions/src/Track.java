//Devon Andersen
import java.util.Scanner;
public class Track {	
	public static Scanner scanner = new Scanner(System.in);
	
	private int trackNum;
	public int getTrackNum() {return trackNum;}
	public void setTrackNum(int tn) {trackNum = tn;}
	
	private String title;
	public String getTitle() {return title;}
	public void setTitle(String t) {title = t;}
	
	private String artist;
	public String getArtist() {return artist;}
	public void setArtist(String a) {artist = a;}
	
	private int duration;
	public int getDuration() {return duration;}
	public void setDuration(int d) {duration = d;}
	
	private int bitRate;
	public int getBitRate() {return bitRate;}
	public void setBitRate(int br) {bitRate = br;}
	
	
	// TODO create variables for the following fields: 
	// track number
	// title 
	// artist
	// duration ( in seconds ), 
	// bit rate ( acceptable values are 128 Kbps, 160 Kbps, 192 Kbps, 256 Kbps, 320 Kbps )
	// TODO create getters/setters for the fields
	
	// TODO create a default constructor that prompts for all of the fields
	// TODO when assigning a bit rate make sure it ends up as one of the acceptable values
	// If the number is > 128 but < 160 it should be assigned 128, like wise for 160 - 191, 193 - 255,
	// and 257 - 319
	public Track() {
		System.out.print("Enter track number: ");
		trackNum = Integer.parseInt(scanner.nextLine());
		System.out.print("Enter title: ");
		title = scanner.nextLine();
		System.out.print("Enter artist: ");
		artist = scanner.nextLine();
		System.out.print("Enter duration is seconds: ");
		duration = Integer.parseInt(scanner.nextLine());
		System.out.print("Enter bit rate: ");
		bitRate = Integer.parseInt(scanner.nextLine());
		
		if(bitRate > 128 && bitRate < 160){bitRate = 128;}
		else if(bitRate > 160 && bitRate < 192){bitRate = 160;}
		else if(bitRate > 192 && bitRate < 256){bitRate = 192;}
		else if(bitRate > 256 && bitRate < 320){bitRate = 256;}
		else if(bitRate > 320){bitRate = 320;}
	}
	
	
	
	// TODO create a function that returns a string rating of the bit rate
	// 128, 160 = "Good"
	// 192, 256 = "Better"
	// 320 = "Best
	
	String bitRating(){
		if (bitRate == 128 || bitRate == 160){
			return "Good Quality";}
		else if (bitRate == 192 || bitRate == 256){
			return "Better Quality";}
		else if (bitRate == 320){
			return "Best Quality";}
		else{
			return "Error";}	
	}
	
	
	// TODO create a function that returns a string duration in minutes and seconds ( human readable )
	String longDuration(){
		int min = duration / 60;
		int sec = duration % 60;
		
		if(sec < 10){
			return String.format("%d:0%d", min, sec);}
		else{
			return String.format("%d:%d", min, sec);}
	}
	
	
	
	// TODO create a function that prints out the track's information as follows:
	
	String AllInfo(){
		
		return String.format("%d - %s \n%s \nDuration: %s \n%d Kbps %s", trackNum, title, artist, 
				longDuration(), bitRate, bitRating());
	}
	
	

	/*
	   {track number} - {title}
	   {artist}
	   {human readable duration }
	   {bit rate} {bit rate rating}
	   
	   ex.
	   
	   2 - Nutshell
	   Alice in Chains
	   4 minutes and 19 seconds
	   256 Kbps Better Quality	   
	   
	 */
}