package nLayerdDemo.dataAccess.abstracts;

import java.util.List;

import nLayerdDemo.entities.concretes.Product;

public interface ProductDao {
	//ürünle ilgili neler yapýlýr
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	
	//ürün getir
	Product get(int id);
	
	//ürün listesi array
	List<Product> getAll();
}
