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
			//	System.out.println("Kullanýcý : "+  user.getFirstName() +" kayýt baþarýyla gerçekleþtirildi");
			this.userDao.add(user);
		
			this.mailServices.sendMail(user);
			this.googleServices.signGoogle(user.getEmail(), user.getPassword());
		}
		else {
			System.out.println("Kullanýcý bilgileri hatalý . Lütfen düzeltiniz !");
		}
		
		
		
		
	}

	@Override
	public void delete(User user) {

		System.out.println("Kullanýcý silindi : "+ user.getFirstName());
	}

	@Override
	public boolean invalidEmail(User user) {
		String regex="^(.+)@(.+)$";
		Pattern pattern=Pattern.compile(regex);
		for(User users : this.userDao.gelAll()) {
			if (users.getEmail() == user.getEmail()) {
				System.out.println("Bu mail daha önce kullanýldý");
				return false;
			}
		}
		if(user.getEmail().length()>0) {
			Matcher matcher=pattern.matcher(user.getEmail());
			return matcher.matches();
		}
		else System.out.println("Email adresini boþ býrakamazsýnýz. Lütfen email bilgilerinizi giriniz");
		return false;
	}

	@Override
	public boolean validUser(User user) {

		if (user.getFirstName().length()<2 && user.getLastName().length()<0) {
			System.out.println("Adýnýz ve soyadýnýz en az iki karakterden oluþmak zorundadýr.");
			return false;
		}else if(user.getPassword().length()<6) {
			System.out.println("Parolanýz en az altý karakterden oluþmak zorundadýr.");
			return false;
		}
		
		return true;
	}

}
