package Kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlamaio.HRMS.business.abstracts.UsersServices;
import Kodlamaio.HRMS.dataAccess.abstracts.UsersDao;
import Kodlamaio.HRMS.entities.concretes.Users;

@Service
public class UsersManager implements UsersServices{
	
	private UsersDao usersDao;

	@Autowired
	public UsersManager(UsersDao usersDao) {
		super();
		this.usersDao = usersDao;
	}

	public void add(Users user) {
		this.usersDao.count();	}

	@Override
	public List<Users> getAll() {
		return this.usersDao.findAll();
	}



}
