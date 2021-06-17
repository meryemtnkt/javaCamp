package nLayerdDemo.dataAccess.concretes;

import java.util.List;

import nLayerdDemo.dataAccess.abstracts.ProductDao;
import nLayerdDemo.entities.concretes.Product;

public class HibernateProductDao implements ProductDao {
	//veri eriþim kodlarýmýzý yazýyoruz ve abstracta soyutlama yapýcaz

	@Override
	public void add(Product product) {
		System.out.println("Hibernate ile eklendi : " + product.getName());		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
