package Kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="employees")
public class Employee extends Users{
	
	 @Column(name = "first_name")
	private String firstName;
	 
	 @Column(name = "first_name")
	private String lastName;

	public Employee(int id, String mail, String password, String firstName, String lastName) {
		super(id, mail, password);
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

}
