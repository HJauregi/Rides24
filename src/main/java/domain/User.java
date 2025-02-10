package domain;

public abstract class User {

	private String email;
	private String pass;
	private String name;
	private String surname;
	private int cash;

	
	public User(String email, String pass, String name, String surname) {
		this.email = email;
		this.pass = pass;
		this.name = name;
		this.surname = surname;
		this.cash = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getCash() {
		return cash;
	}
	public void setCash(int cash) {
		this.cash = cash;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String toString(){
		return email+";"+name+";"+"surname";
	}
	
}
