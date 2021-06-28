package kodlamaio.nortwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.nortwind.entities.concretes.Product;
import kodlamaio.nortwind.entities.dtos.ProductWithCategoryDto;

public interface ProductDao extends JpaRepository<Product, Integer> {
	
	//Select * from products where product_name= abc
	Product getByProductName(String productName);
	
	
	//Select * from products where product_name= abc and category_id= 1
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	
	
	//Select * from products where product_name= abc or category_id= 1
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	
	
	//Select * from products where category_id in (1,2,3)
	List<Product> getByCategoryIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	//JpQL
	//Select * from products where product_name=bisey and category_id=bisey
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName, int categoryId);
	
	//Select p.product_id , p.product_name , c.category_name from Category c inner join Product p on c.categoryId=p.categoryId
	@Query("Select new kodlamaio.nortwind.entities.dtos.ProductWithCategoryDto(p.id, p.productName ,c.categoryName) From Category c Inner Join c.products p")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
}
