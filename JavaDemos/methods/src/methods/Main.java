package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	public static void sayiBulmaca() {
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
			mesajVer("Sayý mevcuttur : "+ aranacak);
		}
		else {
			mesajVer("Sayý mevcut deðildir: " + aranacak);
		}
	}
	//parametreli method
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
