package nLayerdDemo;

import nLayerdDemo.business.abstracts.ProductService;
import nLayerdDemo.business.concretes.ProductManager;
import nLayerdDemo.core.JLoggerManagerAdapter;
import nLayerdDemo.dataAccess.concretes.AbcProductDao;
import nLayerdDemo.dataAccess.concretes.HibernateProductDao;
import nLayerdDemo.entities.concretes.Product;
import nLayerdDemo.jLogger.JLoggerManager;

public class Main {

	public static void main(String[] args) {

		//ToDo : Spring IoC ile çözülecek
		//ProductService productService = new ProductManager(new HibernateProductDao());
		ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		
		Product product= new Product(1,2,"elma",12,50);
		productService.add(product);
				
	}

}
