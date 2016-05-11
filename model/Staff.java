package model;

import java.io.Serializable;

public class Staff implements Serializable {

	private int id;
	private String name;
	private String password;
	private String username;

	public Staff(String name, String pass, int id) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return this.password;
	}

	public void setPass(String p) {
		this.password = p;
	}

	public String getUsername() {
		return this.username;
	}

	public void setID(int id) {
		this.id = id;
	}

	public void setUser(String user) {
		this.username = user;
	}
}
