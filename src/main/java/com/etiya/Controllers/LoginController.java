package com.etiya.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Login controller.
 */
@Controller
public class LoginController {

	/**
     * this method returns
     * the login page
     *
     * @return
     */
	@RequestMapping(value="/login.html")
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login");
		return mav;
	}
	

}

