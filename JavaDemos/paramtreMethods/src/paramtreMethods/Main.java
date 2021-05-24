package paramtreMethods;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel";
		String yeniMesaj = mesajVer();
		System.out.println(yeniMesaj);
		int sayi= topla(7,5);
		System.out.println(sayi);
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
}
