package javademos;

public class reCapDemo {

	public static void main(String[] args) {

		double[] myList= {6.2,5.6,4.3,1.3};
		double toplam=0;
		double max=myList[0];
		for (double number:myList) {
			if(max<number) {
				max=number;
			}
			toplam=toplam+number;
			System.out.println(number);
		}
		System.out.println("Toplam = "+ toplam);
		System.out.println("En b�y�k = "+ max);

	}

}
