package dayThreeHomeWork;

public class InstructorManager {

	public void add(Instructor id) {
		System.out.println(id.getId() + "id'li e�itmen eklendi");
	}
	public  void aboutInstructor(Instructor name) {
		System.out.println(name.getName() + " isimli e�itmen bilgileri ekledi.");
	}
	public void delete(Instructor id) {
		System.out.println(id.getId() + " id'ye ait egitmen silindi");
	}
}
