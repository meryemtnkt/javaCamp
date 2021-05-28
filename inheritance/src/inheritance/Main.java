package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin= new IndividualCustomer();
		engin.customerNumber="12345";
		
		
		CorporateCustomer hepsiBurada =new CorporateCustomer();
		hepsiBurada.customerNumber="95458";
				
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber="212131";
		
		
		CustomerManager customerManager= new CustomerManager();
		
		Customer[] customers= {hepsiBurada,engin,abc};
		
		customerManager.addMultiple(customers);
		
		
	/*	customerManager.add(hepsiBurada);
		customerManager.add(engin);
		customerManager.add(abc);
	 */
	}

}
