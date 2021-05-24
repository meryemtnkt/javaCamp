package javademos;

public class sayiBulma {

	public static void main(String[] args) {

		int[] sayilar = new int [] {1,2,5,7,9,0};
		
		int aranacak = 10;
		boolean varMi=false;
		
		for(int sayi: sayilar) { //int i= 0 ; i< sayilar.length;i++
			if (sayi==aranacak) {
				varMi=true;
				break;
			}
			
		}
		if (varMi) {
			System.out.println("Sayý bulunmakta");
		}
		else {
			System.out.println("Sayý bulunmamaktadýr.");
		}

	}

}
