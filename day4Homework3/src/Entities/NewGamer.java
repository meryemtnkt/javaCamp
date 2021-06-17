package Entities;

public class NewGamer {

	private int gamerId;
	private String lastName;
	private String firstName;
	private String nationalId;
	public NewGamer() {
		super();
	}
	public NewGamer(int gamerId, String lastName, String firstName, String nationalId) {
		super();
		this.gamerId = gamerId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.nationalId = nationalId;
	}
	public int getGamerId() {
		return gamerId;
	}
	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getNationalId() {
		return nationalId;
	}
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	
	
}
