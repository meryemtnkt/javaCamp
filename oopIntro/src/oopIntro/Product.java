package oopIntro;

public class Product {
	
	//construction blo�u 
	public Product () {
		System.out.println("ben �al��t�m");
	}
	public Product (int id,String name,double unitPrice,String detail) {
		this(); // class demek parametresiz class yani ben �al��t�m da 3 kere yazacak 
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
