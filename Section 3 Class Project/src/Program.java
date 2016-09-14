// Devon Andersen
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * Create a program that collects information on a person, their posts, and replies to
 * their posts.
 * 
 * Print out the Person in order by last name first
 */

// Person Class - Name, Username, email, password, mobile
// Posts Class - Message, LocalDate, Owner (user), Collection<Reply>
// Reply Class - (Post Class), Post {Parent}
public class Program {

	public static void main(String[] args) {
		User user = new User();
		user.setFirstName("Donald");
		user.setLastName("Dicchico");
		user.setEmail("ddicchico@remulak.net");
		user.setUsername("Blendar");
		user.setPassword("p@ssw0rd");
		
		Post post = new Post();
		post.setMessage("Just say no!");
		post.setOwner(user);
		post.setPosted(LocalDate.now());
		
		Post post2 = new Post();
		post2.setMessage("I tried");
		post2.setOwner(user);
		post2.setPosted(LocalDate.now());
		post2.setParent(post);
		
		
		
		User user2 = new User();
		user2.setFirstName("Jack");
		user2.setLastName("Pearson");
		user2.setEmail("yahoo@google.net");
		user2.setUsername("Dumak");
		user2.setPassword("1234ABC");
		
		Post post3 = new Post();
		post3.setMessage("This is your brain");
		post3.setOwner(user2);
		post3.setPosted(LocalDate.now());
		
		Post post4 = new Post();
		post4.setMessage("This is your brain on drugs");
		post4.setOwner(user2);
		post4.setPosted(LocalDate.now());
		post4.setParent(post3);
		
		Post post5 = new Post();
		post5.setMessage("This is your brain in a hat");
		post5.setOwner(user2);
		post5.setPosted(LocalDate.now());
		post5.setParent(post3);
		
		
		
		
		List<Post> allUser1 = new ArrayList<Post>();
		allUser1.add(post);
		allUser1.add(post2);
		user.setPosts(allUser1);
		
		List<Post> allUser2 = new ArrayList<Post>();		
		allUser2.add(post3);
		allUser2.add(post4);
		allUser2.add(post5);
		user2.setPosts(allUser2);
		
		
		
		List<User> allUsers = new ArrayList<User>();
		allUsers.add(user);
		allUsers.add(user2);
	
		
		for(User u : allUsers){
			u.print();
		}
	
		
		// stream filter post.getParent() == null  = Root Post
		// 								  != null  = Post Reply
		
		
		// Dependency chain
		// Person <- User <- Post <- Reply

		
	}

}
