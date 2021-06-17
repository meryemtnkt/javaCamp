package nLayerdDemo.dataAccess.abstracts;

import java.util.List;

import nLayerdDemo.entities.concretes.Product;

public interface ProductDao {
	//�r�nle ilgili neler yap�l�r
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	
	//�r�n getir
	Product get(int id);
	
	//�r�n listesi array
	List<Product> getAll();
}
