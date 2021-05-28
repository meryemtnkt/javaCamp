package dayThreeHomeWork;

public class InstructorManager {

	public void add(Instructor id) {
		System.out.println(id.getId() + "id'li eðitmen eklendi");
	}
	public  void aboutInstructor(Instructor name) {
		System.out.println(name.getName() + " isimli eðitmen bilgileri ekledi.");
	}
	public void delete(Instructor id) {
		System.out.println(id.getId() + " id'ye ait egitmen silindi");
	}
}
