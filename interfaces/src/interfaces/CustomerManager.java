package interfaces;

public class CustomerManager {

	//private Logger logger;
	private Logger[] loggers;
	
	public CustomerManager(Logger[] loggers) {

		this.loggers= loggers;
	}
	
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi : " + customer.getFistName());
	
	
		Utils.runLoggers(loggers, customer.getFistName());
	
		
		
		
		
		//this.logger.log(customer.getFistName());
	
		
		/*Runloggers kullanýlýcagý için sildik
		 * for(Logger logger: loggers) {
			logger.log(customer.getFistName());
		}*/
		
	//	DatabaseLogger logger = new DatabaseLogger();
	//	logger.log(customer.getFistName() + " veri tabanýna loglandý");
		
		
	}
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi : "+ customer.getFistName());
		
		Utils.runLoggers(loggers, customer.getLastName());
		
		/*
		 * for(Logger logger: loggers) {
			logger.log(customer.getFistName());
		}*/
	}
}
