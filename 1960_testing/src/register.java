
public class register {
	private String username;
	private String password;
	private String email_id;
	
	public register(String username, String password, String email_id) {
		this.username = username;
		this.password = password;
		this.email_id = email_id;
	}
	
	public Boolean registration(String username, String password, String email_id) {
		if(this.username==username && this.password==password && this.email_id==email_id) {
			return true;
		}
		else {
			return false;
		}
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail_id() {
		return email_id;
	}
}
