package kodlamaio.nortwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.nortwind.business.absracts.ProductService;
import kodlamaio.nortwind.core.utilities.result.DataResult;
import kodlamaio.nortwind.core.utilities.result.Result;
import kodlamaio.nortwind.core.utilities.result.SuccessDataResult;
import kodlamaio.nortwind.core.utilities.result.SuccessResult;
import kodlamaio.nortwind.dataAccess.abstracts.ProductDao;
import kodlamaio.nortwind.entities.concretes.Product;

@Service
public class ProductManager  implements ProductService{

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> gelAll() {
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data listelendi");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi");
	}

}
