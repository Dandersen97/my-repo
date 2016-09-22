
public class Card {
	private String accountNumber;
	public String getAccountNumber() {return accountNumber;}
	public void setAccountNumber(String an) {accountNumber = an;}
	
	private String expYear;
	public String getExpYear() {return expYear;}
	public void setExpYear(String ey) {expYear = ey;}
	
	private String expMonth;
	public String getExpMonth() {return expMonth;}
	public void setExpMonth(String em) {expMonth = em;}
	
	private String firstName;
	public String getFirstName() {return firstName;}
	public void setFirstName(String fn) {firstName = fn;}
	
	private String lastName;
	public String getLastName() {return lastName;}
	public void setLastName(String ln) {lastName = ln;}
	
	public void print() {
		 /* 
		 * Class:
		 * Account Number (PAN) - getter/setter
		 * Expiration Year - getter/setter
		 * Expiration Month - getter/setter
		 * Account Holder First Name - getter/setter
		 * Account Holder Last Name - getter/setter
		 */
		
		System.out.println("Account number: " + getAccountNumber());
		System.out.println("Exp Year: " + getExpYear());
		System.out.println("Exp month: " + getExpMonth());
		System.out.println("Account First Name: " + getFirstName());
		System.out.println("Account Last Name: " + getLastName());
	}
}
