package com.etiya.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.etiya.Service.IssuesService;
import com.etiya.entities.Issues;

@Controller
public class IssuesController {

    @Autowired
    IssuesService issuesService;

    @RequestMapping("product/issues/{id}/{pid}")
    public String showForm(@PathVariable Integer id, @PathVariable Integer pid, Model model) {
        model.addAttribute("customerid", id);
        model.addAttribute("pid", pid);
        model.addAttribute("issues", new Issues());

        return "issues-form";
    }

    @RequestMapping(value = "issues", method = RequestMethod.POST)
    public String saveCustomer(Issues issues) {
        issuesService.saveOrUpdate(issues);
        return "redirect:/customer/issueslist";
    }

    @RequestMapping(value = "customer/issueslist", method = RequestMethod.GET)
    public String customerList(Model model) {

        model.addAttribute("issues", issuesService.getAllIssues());

        return "issues-list";
    }

}