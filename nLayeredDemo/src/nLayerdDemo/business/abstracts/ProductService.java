package nLayerdDemo.business.abstracts;

import java.util.List;

import nLayerdDemo.entities.concretes.Product;

public interface ProductService {
	//neyi servis etmek istiyorsak operasyonlar�m�z� yaz�yoruz
	
	void add(Product product);
	List<Product> getAll();

}
