package dayThreeHomeWork;

public class StudentManager {
	public void add(Student id) {
		System.out.println(id.getId() + " id'li �grenci sisteme kay�t edildi.");
	}
	public void started(Student course) {
		System.out.println(course.getCourse()+ " kursuna ba�land�.");
	}
	public void notAdd(Student name) {
		System.out.println(name.getName()+ " isimli ogrencinin notu eklendi.");
	}
}
