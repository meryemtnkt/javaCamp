package day5Homework.dataAccess.abstracts;

import java.util.List;

import day5Homework.entities.concretes.User;

public interface UserDao {

	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> gelAll();
}
