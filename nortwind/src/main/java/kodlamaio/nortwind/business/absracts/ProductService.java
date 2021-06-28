package kodlamaio.nortwind.business.absracts;

import java.util.List;


import kodlamaio.nortwind.core.utilities.result.DataResult;
import kodlamaio.nortwind.core.utilities.result.Result;
import kodlamaio.nortwind.entities.concretes.Product;

public interface ProductService {
	
	
	DataResult<List<Product>> gelAll();
	
	DataResult <List<Product>> getAllSorted();
	
	//sayfalama 
	DataResult<List<Product>> gelAll(int pageNo,int pageSize);
	
	Result add(Product product);
	

	DataResult<	Product >getByProductName(String productName);
		
	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
		
	DataResult<	List<Product>> getByProductNameOrCategoryId(String productName, int categoryId);
		
	DataResult<	List<Product>> getByCategoryIdIn(List<Integer> categories);
		
	DataResult<	List<Product> >getByProductNameContains(String productName);
		
	DataResult<	List<Product>> getByProductNameStartsWith(String productName);
		
	DataResult<	List<Product> >getByNameAndCategory(String productName, int categoryId);

}
