package day5Homework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5Homework.dataAccess.abstracts.UserDao;
import day5Homework.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	private static List<User> users = new ArrayList<>();

	
	public HibernateUserDao() {
		users.add(new User(1,"Engin","Demiroð","eg@gmail.com", "123456"));
		users.add(new User(2,"Örnek","Kiþi","ok@gmail.com", "123456"));
	}
	

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println("Kiþi hibernate ile kayýt gerçekleþti : " + user.getFirstName());
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> gelAll() {
		return users;
	}

}
