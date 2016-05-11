package model;

public class Admin extends Staff {

	private int id;
	private String name;
	private String password;
	private String username;

	public Admin(String name, String pass, int id) {
		super(name, pass, id);
		this.id = id;
		this.name = name;
		this.password = pass;
		String[] firstLast = name.split(" ");
		this.username = firstLast[1] + Integer.toString(this.id);
		// username is automatically generated based off of name/id number
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
