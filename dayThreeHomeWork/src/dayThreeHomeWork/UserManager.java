package dayThreeHomeWork;

public class UserManager {
	public void add(User id) {
		System.out.println(id.getId() + " id'li yeni kullanýcý eklendi.");
	}
	public void login(User name) {
		System.out.println(name.getName() + " isimli kullanýcý sisteme giriþ yaptý.");
	}
	public void delete(User id) {
		System.out.println(id.getId() + " id'li kullanýcý Silindi.");
	}
}
