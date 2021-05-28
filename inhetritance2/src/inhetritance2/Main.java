package inhetritance2;

public class Main {

	public static void main(String[] args) {

		CustomerManager customerLogger = new CustomerManager();
		customerLogger.add(new EmailLogger());
		//		customerLogger.add(new DatabaseLogger());
		// 		customerLogger.add(new FileLogger());

	}

}
