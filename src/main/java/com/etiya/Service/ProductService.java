package com.etiya.Service;

import java.util.List;

import com.etiya.entities.Product;

public interface ProductService {

     public List<Product> getAllProduct();
	 
	 public Product getProductById(long id);
	 
	 public void saveOrUpdate(Product product);
	 
	 public void deleteProductr(long id);
}
