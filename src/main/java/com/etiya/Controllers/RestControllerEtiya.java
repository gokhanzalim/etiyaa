package com.etiya.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.etiya.Service.CustomerService;
import com.etiya.Service.IssuesService;
import com.etiya.Service.ProductService;
import com.etiya.entities.Customer;
import com.etiya.entities.Issues;
import com.etiya.entities.Product;

/**
 * Rest Web Servis controller.
 */
@RestController
@RequestMapping("/rest")
public class RestControllerEtiya {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	IssuesService issuesService;
	
	 /**
     * List all customer
     *
     * @return
     */
	@RequestMapping(method = RequestMethod.GET, value = "/customers")
	public ResponseEntity<List<Customer>> getAllCustomer(){
		
		List<Customer> customers = customerService.getAllCustomer();
		
		return ResponseEntity.ok(customers);
	}
	
	 /**
     * Return one customer
     *
     * @param id
     * @return
     */
	@RequestMapping(method = RequestMethod.GET, value = "/customer/{id}")
	public ResponseEntity<?> getCustomer(@PathVariable("id") Long id) {
		try {
			Customer customer = customerService.getCustomerById(id);
			return ResponseEntity.ok(customer);
		} catch (Exception ex) {
			return ResponseEntity.notFound().build();
		}
	}
	
	 /**
     * List all Products
     *
     * @return
     */
	@RequestMapping(method = RequestMethod.GET, value = "/products")
	public ResponseEntity<List<Product>> getAllProducts(){
		
		List<Product> products = productService.getAllProduct();
		
		return ResponseEntity.ok(products);
	}
	
	 /**
     * List all Issues
     *
     * @return
     */
	@RequestMapping(method = RequestMethod.GET, value = "/allIssues")
	public ResponseEntity<List<Issues>> getAllIssues(){
		
		List<Issues> issues = issuesService.getAllIssues();
		
		return ResponseEntity.ok(issues);
	}
	
}
