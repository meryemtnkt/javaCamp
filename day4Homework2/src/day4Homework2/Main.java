package day4Homework2;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {


		Customer customer = new Customer(101, "Meryem", "Tankut", LocalDate.of(1994, 2, 2), "20894357042");
		BaseCustomerManager baseCustomerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
//				new NeroCustomerManager(new MernisServiceAdapter());
		
		try {
			baseCustomerManager.save(customer);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
