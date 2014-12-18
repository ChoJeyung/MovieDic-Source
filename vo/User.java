package vo;

public class User {
	private int id;
	private String password;
	private String email;
	private String name;
	public int getP_Id() {
		return id;
	}
	public User setP_Id(int id) {
		this.id = id;
		return this;
	}
	public String getPassword() {
		return password;
	}
	public User setPassword(String password) {
		this.password = password;
		return this;
	}
	public String getEmail() {
		return email;
	}
	public User setEmail(String email) {
		this.email = email;
		return this;
	}
	public String getName() {
		return name;
	}
	public User setName(String name) {
		this.name = name;
		return this;
	}
}
