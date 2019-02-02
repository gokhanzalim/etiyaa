package com.etiya.Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.Repositories.ProductRepository;
import com.etiya.entities.Product;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@PersistenceContext
	private EntityManager entityManager;

	
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		return productRepository.findById((int) id).get();

	}

	@Override
	public void saveOrUpdate(Product product) {
		productRepository.save(product);

	}

	@Override
	public void deleteProductr(long id) {
		productRepository.deleteById((int) id);

	}

	@Override
	public List<Product> findByCustomer() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	

}
