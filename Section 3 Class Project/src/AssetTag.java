// Devon Andersen

import java.util.ArrayList;
import java.util.List;

/*
 * Asset Tags are made up of the following criteria:
 * 1.) Database ID: First 7 characters and is a 32 bit integer
 * 2.) Device Type: 3 characters long following the database id
 * 		* Valid Values Are:
 * 			- CMP - Computer
 * 			- LPT - Laptop
 * 			- PRN - Printer
 * 			- PRJ - Projector
 * 			- TBT - Tablet
 * 			- PHN - Phone
 * 			- OTH - Other
 * 3.) Building: 2 Characters following the device type
 * 		* Valid Values Are:
 * 			- MN - Main Campus
 * 			- SA - Sauder Extension Building
 * 			- DC - Downtown Campus
 * 			- WD - Welding Building
 * 			- TC - Technology Building
 * 			- JE - Jones Education Center
 * 4.) Room Number: 5 Characters following the building code
 * 		* This can contain numbers, characters and spaces
 * 5.) PO Number: The PO number is 6 characters following the room number.
 * 		* This is a 32 bit integer corresponding the Purchase Order in the database
 * 6.) Tag Date: 8 digits following PO number. 
 * 		* Format {yyyyMMdd} yyyy = 4 digit year, MM = 2 digit month, dd = 2 digit day
 * 7.) Checksum: 3 hexidecimal characters matching the start of a SHA1 hash function following
 * 	   the tag date.
 * 
 * --------------------
 * 
 * Using the criteria above complete the AssetTag class adding in each fields and it's
 * corresponding getters/setters
 * 
 * Create a constructor that takes an asset tag string. In this constructor using a 
 * regular expression of your design taking into account the criteria and validate the
 * asset tag. Also in the constructor populate the corresponding fields.
 * 
 * For every asset tag, validate and print out through a function the information 
 * in the following format:
 *
 * Example for 0000001CMPMNM102 00037220160113A3F:
 * 
 * ID: 1
 * Computer - Main Campus - M102
 * PO: 372
 * Tagged: 01/13/2016
 * Checksum: A3F
 * 
 */
public class AssetTag {

	public static void main(String[] args) {
		List<String> assets = new ArrayList<String>();
		
		assets.add("0000022CMPMNM121 00021720160113A3F");
		assets.add("0000158CMPMNM121 00021720160113D66");
		assets.add("0000311PHNMNM102 00046820140416EEF");
		assets.add("0000444PRJSAS102 00092020150722FFF");
		
		assets.add("0002589PRNJEJ004 000A2220150801982");
		
		assets.add("0000011CMPMNM108J00031120140509460");
		assets.add("0001635LPTMNM115 00031120150807ABE");
		assets.add("0000387CMPDCDC10300142220130807CAB");
		assets.add("0002020OTHDCDC10500091820120202DEF");
		assets.add("0008511TBTMNM104 00022920150101BAD");
		assets.add("8675309OTHMNM113 00063620140611DAD");
			
		
		
		for(String a : assets){	
			AssetTag at = new AssetTag(a);
			print();
		}
	}
	



	public AssetTag(String tag) {
		
		if(tag.matches("^[0-9]{7}[A-Z]{5}[0-9A-Z ]{5}[0-9]{14}[0-9A-F]{3}$")){
			setDBId(tag.substring(0, 7));
			setDevice(tag.substring(7, 10));
			setBuilding(tag.substring(10, 12));
			setRoom(tag.substring(12, 17));
			setPO(tag.substring(17, 23));
			setTagDate(tag.substring(23, 31));
			setChecksum(tag.substring(31, 34));}
		}
	
	public static void print(){
		System.out.println("ID: " + getDBId());
		System.out.println(getDevice() + " - " + getBuilding() + " - " + getRoom());
		System.out.println("PO: " + getPO());
		System.out.println("Tagged Date: " + getTagDate());
		System.out.println("Checksum: " + getChecksum());
		System.out.println("--------------------------------");
	}
	
	
	
	
	private static String DBId;
	public static String getDBId() {return DBId;}
	public static void setDBId(String i) {
		i = i.replaceAll("^0+", "");
		DBId = i;}
	
	
	private static String Device;
	public static String getDevice() {return Device;}
	public static void setDevice(String d) {
		if(d.matches("^[C][M][P]$")){d = "Computer";}
		else if(d.matches("^[L][P][T]$")){d = "Laptop";}
		else if(d.matches("^[P][R][N]$")){d = "Printer";}
		else if(d.matches("^[P][R][J]$")){d = "Projector";}
		else if(d.matches("^[T][B][T]$")){d = "Tablet";}
		else if(d.matches("^[P][H][N]$")){d = "Phone";}
		else if(d.matches("^[O][T][H]$")){d = "Other";}
		Device = d;}
	
	
	private static String Building;
	public static String getBuilding() {return Building;}
	public static void setBuilding(String b) {
		if(b.matches("^[M][N]$")){b = "Main Campus";}
		else if(b.matches("^[S][A]$")){b = "Sauder Extension Building";}
		else if(b.matches("^[D][C]$")){b = "Downtown Campus";}
		else if(b.matches("^[W][D]$")){b = "Welder Building";}
		else if(b.matches("^[T][C]$")){b = "Technology Building";}
		else if(b.matches("^[J][E]$")){b = "Jones Education Building";}
		Building = b;}
	
	
	private static String Room;
	public static String getRoom() {return Room;}
	public static void setRoom(String r) {Room = r;}
	
	
	private static String PO;
	public static String getPO() {return PO;}
	public static void setPO(String p) {
		p = p.replaceAll("^0+", "");
		PO = p;}
	
	
	private static String TagDate;
	public static String getTagDate() {return TagDate;}
	public static void setTagDate(String t) {
		t = t.substring(4, 6) + "/" + t.substring(6, 8) + "/" + t.substring(0, 4);
		TagDate = t;}
	
	
	private static String Checksum;
	public static String getChecksum() {return Checksum;}
	public static void setChecksum(String c) {Checksum = c;}
	
}
