package day5Homework.business.abstracts;

import day5Homework.entities.concretes.User;

public interface UserServices {
	
	void add(User user);
	void delete(User user);
	boolean invalidEmail(User user);
	boolean validUser(User user);

}
