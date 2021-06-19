package Kodlamaio.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="employers")
public class Employer extends Users{

	@Column(name="id")
	private int id;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_adress")
	private String webAdress;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="is_active")
	private boolean isActive;

	public Employer(int id, String mail, String password, int id2, String companyName, String webAdress, String phone,
			boolean isActive) {
		super(id, mail, password);
		id = id2;
		this.companyName = companyName;
		this.webAdress = webAdress;
		this.phone = phone;
		this.isActive = isActive;
	}
	

	
	
	

}
