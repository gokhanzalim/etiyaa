package com.etiya.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.etiya.Service.ProductService;
import com.etiya.entities.Product;

/**
 * Product controller.
 */
@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    /**
     * New product
     * Save product to database.
     * @param model
     * @return
     */
    @RequestMapping(value = "product", method = RequestMethod.POST)
    public String saveCustomer(Product product) {
        productService.saveOrUpdate(product);
        return "redirect:/customer/list";
    }
    
    /**
     * this method returns
     * the product form
     *
     * @param id
     * @param model
     * @return
     */

    @RequestMapping("customer/productadd/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("ids", id);
        model.addAttribute("product", new Product());

        return "product_form";
    }
    
    /**
     * List all product
     *
     * @param model
     * @return
     */

    @RequestMapping(value = "customer/productlist", method = RequestMethod.GET)
    public String customerList(Model model) {

        model.addAttribute("products", productService.findByCustomer());

        return "product-list";
    }

}