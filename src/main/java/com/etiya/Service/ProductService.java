package com.etiya.Service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.etiya.entities.Product;

public interface ProductService {

     public List<Product> getAllProduct();
	 
	 public Product getProductById(long id);
	 
	 public void saveOrUpdate(Product product);
	 
	 public void deleteProductr(long id);
	 
	 @Query("SELECT * FROM products t WHERE t.customer_id = 'id'")
	 public List<Product> findByCustomer();
}
