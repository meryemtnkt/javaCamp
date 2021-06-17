package nLayerdDemo.business.concretes;

import java.util.List;

import nLayerdDemo.business.abstracts.ProductService;
import nLayerdDemo.core.LoggerService;
import nLayerdDemo.dataAccess.abstracts.ProductDao;
import nLayerdDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao;
	private LoggerService loggerService;
	
	//constructor ile hibernate ile referansýný tutuyor
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	@Override
	public void add(Product product) {
		//iþ kodlarý yazýlýr / kurallarý yazýyoruz
		if(product.getCategoryId()==1) {
			System.out.println("Bu Kategoride ürün kabul edilmiyor");
			return;
		}
		//veri eriþimi 
		
		//baðýmlý bir yapý oluþturursak unittest yazamayýz 
		//HibernateProductDao dao=new HibernateProductDao();
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Ürün eklendi : " + product.getName());
		
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	//iþ yapan sýnýfýmýz soyutla

}
