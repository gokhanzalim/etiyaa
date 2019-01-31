package com.etiya.Service;

import java.util.List;

import com.etiya.entities.Customer;

public interface CustomerService {
	
	 public List<Customer> getAllCustomer();
	 
	 public Customer getCustomerById(long id);
	 
	 public void saveOrUpdate(Customer customer);
	 
	 public void deleteCustomer(long id);
}
