package kodlamaio.nortwind.business.absracts;

import java.util.List;

import kodlamaio.nortwind.core.utilities.result.DataResult;
import kodlamaio.nortwind.core.utilities.result.Result;
import kodlamaio.nortwind.entities.concretes.Product;

public interface ProductService {
	
	
	DataResult<List<Product>> gelAll();
	
	Result add(Product product);

}
