/*
 * This class takes us back to the good old days of Napster and Morpheus file sharing. The track below
 * represents a MP3 audio track. Complete the todo statements and submit the file to moodle.
 */
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
		
		if((bitRate > 128 && bitRate < 160) || (bitRate > 160 && bitRate < 192) ||
				(bitRate > 192 && bitRate < 256) || (bitRate > 256 && bitRate < 320)){
			bitRate = 128;
		}
	}
	
	
	
	// TODO create a function that returns a string rating of the bit rate
	// 128, 160 = "Good"
	// 192, 256 = "Better"
	// 320 = "Best
	
	public static String bitRating(int br){
		if (br == 128 || br == 160){
			return "Good";}
		else if (br == 192 || br == 256){
			return "Better";}
		else if (br == 320){
			return "Best";}
		else{
			return "Error";}	
	}
	
	
	// TODO create a function that returns a string duration in minutes and seconds ( human readable )
	public static String longDuration(int durationTime){
		double min = (double)durationTime / 60;
		double sec = (double)durationTime % 60;
		
		if(sec < 10){
			return String.format("%d:%d", min, sec);
		}
		else{
			return String.format("%d:0%d", min, sec);
		}
	}
	
	
	
	// TODO create a function that prints out the track's information as follows:
	public static String AllInfo(int tn, String t, String art, int time, int br){

		return String.format("%d - %s \n%s \n%d \n%d %s", tn, t, art, 
				longDuration(time), br, bitRating(br));
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