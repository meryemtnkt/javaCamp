package interfaces;

public class CustomerManager {

	//private Logger logger;
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {

		this.loggers= loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("M��teri eklendi : " + customer.getFistName());
	
	
		Utils.runLoggers(loggers, customer.getFistName());
	
		
		
		
		
		//this.logger.log(customer.getFistName());
	
		
		/*Runloggers kullan�l�cag� i�in sildik
		 * for(Logger logger: loggers) {
			logger.log(customer.getFistName());
		}*/
		
	//	DatabaseLogger logger = new DatabaseLogger();
	//	logger.log(customer.getFistName() + " veri taban�na logland�");
		
		
	}
	public void delete(Customer customer) {
		System.out.println("M��teri silindi : "+ customer.getFistName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		
		/*
		 * for(Logger logger: loggers) {
			logger.log(customer.getFistName());
		}*/
	}
}
