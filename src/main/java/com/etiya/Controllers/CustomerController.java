package com.etiya.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.etiya.Service.CustomerService;
import com.etiya.entities.Customer;


@Controller
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	
	    @RequestMapping("customer/new")
	    public String newCustomer(Model model) {
	        model.addAttribute("customer", new Customer());
	        return "customer_form";
	    }

	    @RequestMapping(value = "customer", method = RequestMethod.POST)
	    public String saveCustomer(Customer customer) {
	    	 customerService.saveOrUpdate(customer);
	        return "redirect:/customer/list";
	    }
	    
	    @RequestMapping(value = "/customer/list", method = RequestMethod.GET)
	    public String customerList(Model model) {
	    	
	      model.addAttribute("customers", customerService.getAllCustomer());
	      
	        return "customer-list";
	    }
	    
	    @GetMapping("customer/findOne")
		@ResponseBody
		public Customer findOne(Integer id) {
			return customerService.getCustomerById(id);
			
		}
	    
	   /* @RequestMapping("customer/productadd/{id}")
	    public String edit(@PathVariable Integer id, Model model) {
	    	 model.addAttribute("id", id);
	    	 

	        model.addAttribute("customer", customerService.getCustomerById(id));
	        return "product_form";
	    }*/
}
