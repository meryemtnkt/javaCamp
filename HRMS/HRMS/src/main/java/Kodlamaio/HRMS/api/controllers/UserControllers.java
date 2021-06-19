package Kodlamaio.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlamaio.HRMS.business.abstracts.UsersServices;
import Kodlamaio.HRMS.entities.concretes.Users;

@RestController
@RequestMapping("/api/users")
public class UserControllers {
	private UsersServices userServices;

	@Autowired
	public UserControllers(UsersServices userServices) {
		super();
		this.userServices = userServices;
	}
	
	@GetMapping
	public List<Users> getAll(){
		return this.userServices.getAll();
		
	}
	

}
