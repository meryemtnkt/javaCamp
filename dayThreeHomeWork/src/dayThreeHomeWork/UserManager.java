package dayThreeHomeWork;

public class UserManager {
	public void add(User id) {
		System.out.println(id.getId() + " id'li yeni kullan�c� eklendi.");
	}
	public void login(User name) {
		System.out.println(name.getName() + " isimli kullan�c� sisteme giri� yapt�.");
	}
	public void delete(User id) {
		System.out.println(id.getId() + " id'li kullan�c� Silindi.");
	}
}
