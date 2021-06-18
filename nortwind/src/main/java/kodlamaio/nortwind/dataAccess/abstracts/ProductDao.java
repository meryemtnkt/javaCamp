package kodlamaio.nortwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.nortwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {

}
