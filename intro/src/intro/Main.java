package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//camelCase isimlendirme kullan�l�yor
		
		String internetSubeButonu ="�nternet �ubesi";
		Double dolarDun= 8.10;
		Double dolarBugun= 8.10;

		//int vade = 36;
		//	boolean dolarDustumu = false ;
		
		
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� image");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi image");
		}
		else {
			System.out.println("Dolar e�ittir image");
		}
		
		
		String kredi1 = "H�zl� Kredi" ;
		String kredi2 = "Mutlu emekli Kredisi" ;
		String kredi3 = "Konut Kredisi" ;
		String kredi4 = "�ift�i Kredisi" ;
		String kredi5 = "Msb Kredisi" ;
		String kredi6 = "Meb Kredisi";

		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		
		String[] krediler = 
			{
				"H�zl� Kredi",
				"Mutlu emekli Kredisi",
				"Konut Kredisi",
				"�ift�i Kredisi",
				"Msb Kredisi",
				"Meb Kredisi",
				"K�lt�r bakanl��� kredisi"
			};
		//foreach d�ng�
		for(String kredi:krediler) {
			System.out.println(kredi);
		}
		
		System.out.println("for d�ng� elemanlar�: ");
		for(int i=0; i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		
		int sayi1=10;
		int sayi2= 20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		
		String sehir1="ankara";
		String sehir2="istanbul";
		sehir1=sehir2;
		sehir2="izmir";
		System.out.println(sehir1);

		

	}

}
