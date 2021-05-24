package paramtreMethods;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = mesajVer();
		System.out.println(yeniMesaj);
		int sayi= topla(7,5);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5,6,10); //...sayilar[]
		System.out.println(toplam);
	}
	public static void ekle() {
		System.out.println("eklendi");
	}
	public static void sil() {
		System.out.println("silindi");
		}
	public static void guncelle() {
		System.out.println("guncellendi");
	}

	public static String mesajVer() {
		return "istanbul";
	}
	public static int topla(int sayi1 , int sayi2 ) {
		return sayi1+sayi2;
	}
	public static int topla2(int... sayilar) { //variable arguments
		int toplam=0;
		for (int i : sayilar) {
			toplam+=i;
		}
		return toplam;
	}
}
