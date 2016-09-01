// Devon Andersen
/*
 * Create a class that store information for a game. Please try to research and use real examples. Complete the todo statements and upload to moodle when
 * completed.
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class VideoGame {
		public static Scanner in = new Scanner(System.in);
		
		private String gameTitle;
		public String getGameTitle() { return gameTitle; }
		public void setGameTitle(String gt) { gameTitle = gt; }
		private String genre;
		public String getGenre() { return genre; }
		public void setGenre(String g) { genre = g; }
		private String platform;
		public String getPlatform() { return platform; }
		public void setPlatform(String p) { platform = p; }
		private int numPlayers;
		public int getNumPlayers() { return numPlayers; }
		public void setNumPlayers(int np) { numPlayers = np; }
		private String gameRating;
		public String getGameRating() { return gameRating; }
		public void setGameRating(String gr) { gameRating = gr; }
		private double cost;
		public double getCost() { return cost; }
		public void setCost(double c) { cost = c; }
		private String age;
		/*
		 Create fields for:
		 --------------------------------------
		 	Title
		 	Genre
		 	Platform ( x box, pc, etc... )
		 	Number of Players
		 	Game Rating C - Early Childhood, E - Everyone, E 10+ - Everyone 10+, Teen (13+), Mature 17+,  Adult Only 18+
		 	Cost
		 */

		public VideoGame() {
			System.out.print("Enter game title: ");
			gameTitle = VideoGame.in.nextLine();
			System.out.print("Enter genre: ");
			genre = VideoGame.in.nextLine();
			System.out.print("Enter platform: ");
			platform = VideoGame.in.nextLine();
			System.out.print("Enter number of players: ");
			numPlayers = Integer.parseInt(VideoGame.in.nextLine());
			System.out.print("Enter game rating: ");
			gameRating = VideoGame.in.nextLine();
			System.out.print("Enter cost: ");
			cost = Double.parseDouble(VideoGame.in.nextLine());
		}


		String AgeRating(){
			System.out.print("Enter your age: ");
			age = VideoGame.in.nextLine();
			if (gameRating.equals("C")){
				if (Integer.parseInt(age) < 10){return "Good to play";}
				else{return "Don't play";}}
			else if (gameRating.equals("E")){
				return "Good to play";}
			else if (gameRating.equals("E 10+") ){
				if (Integer.parseInt(age) >= 10){return "Good to play";}
				else{return "Don't play";}}
			else if (gameRating.equals("T")){
				if (Integer.parseInt(age) >= 13){return "Good to play";}
				else{return "Don't play";}}
			else if (gameRating.equals("M")){
				if (Integer.parseInt(age) >= 17){return "Good to play";}
				else{return "Don't play";}}
			else if (gameRating.equals("A")){
				if (Integer.parseInt(age) >= 18){return "Good to play";}
				else{return "Don't play";}}
			else{return "Error";}
		}
		
		
		String AllGameInfo(){
		 	DecimalFormat fmt = new DecimalFormat("$#,##0.00");
		 	String prettyMoney = fmt.format(cost); 
		 	
		 	String gameRatingText = null;
		 	if (gameRating.equals("E"))  {gameRatingText = "Everyone";}
		 	else if (gameRating.equals("C"))  {gameRatingText = "Early Childhood";}
		 	else if (gameRating.equals("E 10+"))  {gameRatingText = "Everyone 10 and Up";}
		 	else if (gameRating.equals("T"))  {gameRatingText = "Teen (13+)";}
		 	else if (gameRating.equals("M"))  {gameRatingText = "Mature (17+)";}
		 	else if (gameRating.equals("A"))  {gameRatingText = "Adults Only (18+)";}
		 	
			return String.format("%s - %s\n%s\n%s %s Number of Players: %s\nCost: %s", gameTitle, genre,
					platform, gameRating, gameRatingText, numPlayers, prettyMoney);
		}
		
		

		// TODO Create print function to print out game details 7pts
		/*
		 	{title} - {genre}
		 	{platform}
		 	{game rating} {game rating text} Number of Players: {number of players}
		 	{cost:$#,#00.00}
		 	
		 	ex.
		 	
		 	Skyrim - Fantasy
		 	X-Box 360
		 	M Mature 17+ Number of Players: 1
		 	cost: $18.99
		 	
		 	
		 	Hint: if you care to use
		 	# is a place holder that is only shown if there is a value
		 	0 is a place holder that is always shown
		 	.00 means that this will round and only display out to 2 decimal places
		 	
		 	DecimalFormat fmt = new DecimalFormat("$#,##0.00"); // This is a common money format.
		 	String prettyMoney = fmt.format(cost); // Function returns a string with the format you have specified. 	
		 */

}
