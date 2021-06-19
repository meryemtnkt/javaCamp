package Kodlamaio.HRMS.business.abstracts;

import java.util.List;

import Kodlamaio.HRMS.entities.concretes.Users;

public interface UsersServices {
	
	void add(Users user);
	List<Users> getAll();

}
