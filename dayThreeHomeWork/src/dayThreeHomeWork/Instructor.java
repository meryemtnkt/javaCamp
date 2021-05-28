package dayThreeHomeWork;

public class Instructor extends User {

	private String certific;
	private String about;
	
	public Instructor(int id, String name, String lastName,String certific, String about) {
		super(id, name, lastName, about);
		this.certific = certific;
		this.about = about;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getCertific() {
		return certific;
	}

	public void setCertific(String certific) {
		this.certific = certific;
	}
	
}
