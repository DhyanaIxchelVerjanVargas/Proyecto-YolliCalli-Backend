package proyecto.yollicalli.model;


public class User {

	private String name;
	private String email;
	private String phone;
	private String password;
	private int id;
	private static int total=0;
	public User(String name, String email, String phone, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.password = password;
		User.total++;
		id=User.total;
	}//constructor
	public User() {
		User.total++;
		id=User.total;
	}//constructor vacio
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}//getters and setters
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", phone=" + phone + ", password=" + password + ", id=" + id
				+ "]";
	}//tostring
	
	
	
	

	
	
	
}//user
