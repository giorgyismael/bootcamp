package model.dao;

import java.util.List;
import model.entities.Product;

public interface ProductDao {
	void insert(Product object);
	void delete(Product object);
	void update(Product object);
	Product fyndbyId(int id);
	List<Product> getAllProduct();
}
