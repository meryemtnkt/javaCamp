package day5Homework;



import day5Homework.business.abstracts.UserServices;
import day5Homework.business.concretes.UserManager;
import day5Homework.core.concretes.JGoogleManagerAdapter;
import day5Homework.core.concretes.MailManagerAdapter;
import day5Homework.dataAccess.concretes.HibernateUserDao;
import day5Homework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User admin=new User(10, "Meryem", "Tankut", "mt@gmail.com", "123456");
		
		UserServices sevices=new UserManager(new HibernateUserDao(),new JGoogleManagerAdapter(),new MailManagerAdapter());
		sevices.add(admin);

	}

}
