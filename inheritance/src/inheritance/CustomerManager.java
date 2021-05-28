package inheritance;

public class CustomerManager {

	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " kaydedildi. ");
	}
	public void addMultiple(Customer[] customers) {
		 for (Customer customer:customers) {
			 //yukardaki add i �al��t�r
			 add(customer);
		 }
	}
}
