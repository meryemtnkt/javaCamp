package oopIntro;

public class Product {
	
	//construction bloðu 
	public Product () {
		System.out.println("ben çalýþtým");
	}
	public Product (int id,String name,double unitPrice,String detail) {
		this(); // class demek parametresiz class yani ben çalýþtým da 3 kere yazacak 
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	

}
