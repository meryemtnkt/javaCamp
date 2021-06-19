package Kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Table;

import lombok.Data;
import javax.persistence.Entity;

@Entity
@Data
@Table(name="users")
public class Users{
	
	@Column(name="id")
	private int id;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="password")
	private String password;
	public Users(int id, String mail, String password) {
		super();
		this.id = id;
		this.mail = mail;
		this.password = password;
	}

}
