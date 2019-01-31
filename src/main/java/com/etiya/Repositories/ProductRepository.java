package com.etiya.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.entities.Product;



public interface ProductRepository extends JpaRepository<Product,Integer>{

	
}
