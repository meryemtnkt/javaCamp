package day5Homework.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5Homework.business.abstracts.UserServices;
import day5Homework.core.abstracts.GoogleServices;
import day5Homework.core.abstracts.MailServices;
import day5Homework.dataAccess.abstracts.UserDao;
import day5Homework.entities.concretes.User;

public class UserManager implements UserServices {

	private UserDao userDao;
	private GoogleServices googleServices;
	private MailServices mailServices;
	
	public UserManager(UserDao userDao,GoogleServices googleServices,MailServices mailServices) {
		this.userDao = userDao;
		this.googleServices=googleServices;
		this.mailServices=mailServices;
	}

	@Override
	public void add(User user) {
		if(invalidEmail(user) && validUser(user)) {
			//	System.out.println("Kullan�c� : "+  user.getFirstName() +" kay�t ba�ar�yla ger�ekle�tirildi");
			this.userDao.add(user);
		
			this.mailServices.sendMail(user);
			this.googleServices.signGoogle(user.getEmail(), user.getPassword());
		}
		else {
			System.out.println("Kullan�c� bilgileri hatal� . L�tfen d�zeltiniz !");
		}
		
		
		
		
	}

	@Override
	public void delete(User user) {

		System.out.println("Kullan�c� silindi : "+ user.getFirstName());
	}

	@Override
	public boolean invalidEmail(User user) {
		String regex="^(.+)@(.+)$";
		Pattern pattern=Pattern.compile(regex);
		for(User users : this.userDao.gelAll()) {
			if (users.getEmail() == user.getEmail()) {
				System.out.println("Bu mail daha �nce kullan�ld�");
				return false;
			}
		}
		if(user.getEmail().length()>0) {
			Matcher matcher=pattern.matcher(user.getEmail());
			return matcher.matches();
		}
		else System.out.println("Email adresini bo� b�rakamazs�n�z. L�tfen email bilgilerinizi giriniz");
		return false;
	}

	@Override
	public boolean validUser(User user) {

		if (user.getFirstName().length()<2 && user.getLastName().length()<0) {
			System.out.println("Ad�n�z ve soyad�n�z en az iki karakterden olu�mak zorundad�r.");
			return false;
		}else if(user.getPassword().length()<6) {
			System.out.println("Parolan�z en az alt� karakterden olu�mak zorundad�r.");
			return false;
		}
		
		return true;
	}

}
