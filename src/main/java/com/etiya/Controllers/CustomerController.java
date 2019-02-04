package com.etiya.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.etiya.Service.CustomerService;
import com.etiya.entities.Customer;

/**
 * Customer controller.
 */
@Controller
public class CustomerController {

    @Autowired
    CustomerService customerService;

    /**
     * this method returns
     * the customer record form
     *
     * @param model
     * @return
     */
    @RequestMapping("customer/new")
    public String newCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer_form";
    }
    
    /**
     * New customer
     * Save customer to database.
     * @param model
     * @return
     */

    @RequestMapping(value = "customer", method = RequestMethod.POST)
    public String saveCustomer(Customer customer) {
        customerService.saveOrUpdate(customer);
        return "redirect:/customer/list";
    }
    
    
    /**
     * List all customer
     *
     * @param model
     * @return
     */

    @RequestMapping(value = "/customer/list", method = RequestMethod.GET)
    public String customerList(Model model) {

        model.addAttribute("customers", customerService.getAllCustomer());

        return "customer-list";
    }

    
    /**
     * this method returns
     * the customer edit form
     *
     * @param id
     * @param model
     * @return
     */

    @RequestMapping("customer/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", customerService.getCustomerById(id));
        return "customer_edit";
    }

}