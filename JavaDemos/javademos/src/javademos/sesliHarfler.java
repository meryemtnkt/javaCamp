package javademos;

public class sesliHarfler {

	public static void main(String[] args) {

		char harf='E';
		
		switch (harf) {
		case 'A': 
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalýn sesli harf");
			break;
		default:
				System.out.println("Ýnce sesli harf");
		}
	}

}
