package com.etiya.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiya.Repositories.CustomerRepository;
import com.etiya.entities.Customer;

@Service
@Transactional
public class CustomerServiceImpl  implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> getAllCustomer() {
		
		return customerRepository.findAll();
	}

	@Override
	public Customer getCustomerById(long id) {
	
		return customerRepository.findById((int) id).get();
	}

	@Override
	public void saveOrUpdate(Customer customer) {
		
		customerRepository.save(customer);
		
	}

	@Override
	public void deleteCustomer(long id) {
		
		customerRepository.deleteById((int) id);
		
	}

}
