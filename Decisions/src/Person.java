import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Person {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		
		Person p1 = new Person();
		p1.setFirstName("Fred");
		p1.setLastName("Flintstone");
		people.add(p1);
		
		Person p2 = new Person();
		p2.setFirstName("Stewie");
		p2.setLastName("Griffin");
		people.add(p2);
		
		Person p3 = new Person();
		p3.setFirstName("Jeffrey");
		p3.setLastName("Dahmer");
		people.add(p3);
		
		Person p4 = new Person();
		p4.setFirstName("Wesley");
		p4.setLastName("Snipes");
		people.add(p4);
		
		
		// Sorting- Order By
		// Filtering- SQL WHERE (return you a subset of a list)
		
		// Lambda expression () ->, () =>
		Collections.sort(people, (x, y) -> x.getFirstName().compareTo(y.getFirstName()));;
		
		
		
		// Stream | ParallelStream
		// Collections / a steam represents functions to manage a collection
		// Steam- single threaded apartment model
		// ParallelStream - parallel processing model
		
		// Parallel vs Thread
		//-------------------
		// Race Condition - First in wins
		// Deadlock - One tread does not release resources, locks other threads out
		
		people.stream()
		.filter(x -> x.getFirstName().startsWith("W") && x.getLastName().startsWith("S"))
		.sorted((x, y) -> x.getFirstName().compareTo(y.getFirstName()))
		.sorted((x, y) -> Integer.compare(x.getAge(), y.getAge()))
		.forEach(x -> System.out.println(x.getFirstName() + " " + x.getLastName()));
		
		people.parallelStream().forEach(x -> System.out.println(x.getFirstName() + " " + x.getLastName()));
		
		
		
	}
	
	private String firstName;
	public String getFirstName(){return firstName;}
	public void setFirstName(String fn) {firstName = fn;}
	
	private String lastName;
	public String getLastName(){return lastName;}
	public void setLastName(String ln) {lastName = ln;}

	private int age;
	public int getAge() {return age;};
	public void setAge(int i){age = i;};
}
