package oopIntro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Product  products1 =  new Product(1,"Lenovo",15000,"16 GB ram"); //referans oluþturma	, intance	
	//	products1.id =1;
	//	products1.name="Lenovo";
	//	products1.unitPrice=15000;
	//	products1.detail = "16 GB ram";
	
		Product  products2 =  new Product(); //referans oluþturma		
		products2.id =1;
		products2.name="Lenovo 2";
		products2.unitPrice=2500;
		products2.detail = "32 GB ram";
		
		Product  products3 =  new Product(); //referans oluþturma		
		products3.id =1;
		products3.name="Hp 3";
		products3.unitPrice=10000;
		products3.detail = "18 GB ram";
		
		Product[] products = {products1,products2,products3};

		for (Product product: products) {
			 System.out.println(product.name);
			
		}
	    System.out.println(products.length);
	    
	    
	    Category category1= new Category();
	    category1.id=1;
	    category1.name="Bilgisayar";
	    
	    Category category2= new Category();
	    category2.id=2;
	    category2.name="Ev/Bahçe";
	    
	    ProductManager productManager = new ProductManager();
	    productManager.addToCart(products1);
	    
	    
	    productManager.addToCart(products2);
	    
	    
	    productManager.addToCart(products3);
	    
	    
	    
	}

}
