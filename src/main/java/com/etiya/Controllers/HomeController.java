package com.etiya.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Home controller.
 */
@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("index.html")
	public String homePage() {
		
		return"index";
	}
}
