package dayThreeHomeWork;

public class Student  extends User{
	
	private String classes;
	private int note;
	
	public Student(int id, String name, String lastName,String classes, int note) {
		super(id, name, lastName, classes);
		this.classes = classes;
		this.note = note;
	}
	
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		this.note = note;
	}
	
	
}
