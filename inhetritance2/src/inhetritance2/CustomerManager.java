package inhetritance2;

public class CustomerManager {

	public void add(Logger logger) {
		//müþteri ekleme kodlarý
		System.out.println("müþteri eklendi");
		
		//eðer iþ yapan sýnýf baþka bir iþ yapan sýnýf kullanýcaksa asla new yapýlmaz
		//somut sýnýf kullanýlmaz
		/*	DatabaseLogger logger = new DatabaseLogger();
		logger.log();
		*/
		
		logger.log();
	}
}
