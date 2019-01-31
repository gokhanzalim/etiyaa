package com.etiya.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etiya.entities.Customer;


public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
