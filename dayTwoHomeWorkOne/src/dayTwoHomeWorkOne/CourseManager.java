package dayTwoHomeWorkOne;

public class CourseManager {

	public void AddToCart(Course courses) {
		System.out.println(courses.courseName +" Kursa Kayýt ol");
	}
	public void courseStart(Course courses) {
		System.out.println(courses.courseName + courses.percent + " % TAMAMLANDI");
		
	}
}
