import java.util.List;

public class User extends Person {

	private String username;
	public String getUsername() {return username;}
	public void setUsername(String un) {username = un;}
	
	
	private String email;
	public String getEmail() {return email;}
	public void setEmail(String em) {email = em;}
	
	private String password;
	public String getPassword() {return password;}
	public void setPassword(String pw) {password = pw;}
	
	private String mobile;
	public String getMobile() {return mobile;}
	public void setMobile(String mo) {mobile = mo;}
	
	private List<Post> posts;
	public List<Post> getPosts() {return posts;}
	public void setPosts(List<Post> p) {posts = p;}
	
	
}
