package nLayerdDemo.business.concretes;

import java.util.List;

import nLayerdDemo.business.abstracts.ProductService;
import nLayerdDemo.core.LoggerService;
import nLayerdDemo.dataAccess.abstracts.ProductDao;
import nLayerdDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;
	
	//constructor ile hibernate ile referans�n� tutuyor
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		//i� kodlar� yaz�l�r / kurallar� yaz�yoruz
		if(product.getCategoryId()==1) {
			System.out.println("Bu Kategoride �r�n kabul edilmiyor");
			return;
		}
		//veri eri�imi 
		
		//ba��ml� bir yap� olu�turursak unittest yazamay�z 
		//HibernateProductDao dao=new HibernateProductDao();
		
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n eklendi : " + product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	//i� yapan s�n�f�m�z soyutla

}
