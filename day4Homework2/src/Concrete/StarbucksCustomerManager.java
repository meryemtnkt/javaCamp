package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckSevice;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {

	private CustomerCheckSevice _checkCustomerServices;
	
	public StarbucksCustomerManager(CustomerCheckSevice customerCheckSevice) {
		this._checkCustomerServices=customerCheckSevice;
	}

	@Override
	public void save(Customer customer) {
		if (_checkCustomerServices.CheckIfRealPerson(customer)) {
			System.out.println("Saved to db : " + customer.getFirstName());
		} else {
			System.out.println("gerçek kiþi deðil");
		}
	
		
	}
	
}
