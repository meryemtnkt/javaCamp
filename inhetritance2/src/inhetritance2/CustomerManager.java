package inhetritance2;

public class CustomerManager {

	public void add(Logger logger) {
		//m��teri ekleme kodlar�
		System.out.println("m��teri eklendi");
		
		//e�er i� yapan s�n�f ba�ka bir i� yapan s�n�f kullan�caksa asla new yap�lmaz
		//somut s�n�f kullan�lmaz
		/*	DatabaseLogger logger = new DatabaseLogger();
		logger.log();
		*/
		
		logger.log();
	}
}
