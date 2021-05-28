package dayThreeHomeWork;

public class User {
	
	private int id;
	private String name;
	private String lastName;
	private String course;
	
	public User() {
		
	}
	public User(int id, String name, String lastName, String course) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.course = course;
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
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
}
