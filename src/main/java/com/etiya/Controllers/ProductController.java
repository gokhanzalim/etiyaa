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

@Controller
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "product", method = RequestMethod.POST)
    public String saveCustomer(Product product) {
        productService.saveOrUpdate(product);
        return "redirect:/customer/list";
    }

    @RequestMapping("customer/productadd/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("ids", id);
        model.addAttribute("product", new Product());

        return "product_form";
    }

    @RequestMapping(value = "customer/productlist", method = RequestMethod.GET)
    public String customerList(Model model) {

        model.addAttribute("products", productService.findByCustomer());

        return "product-list";
    }

}