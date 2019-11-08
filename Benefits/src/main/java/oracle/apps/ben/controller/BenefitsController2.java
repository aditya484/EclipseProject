package oracle.apps.ben.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import oracle.apps.ben.service.UserService;

@Controller
public class BenefitsController2 {
	
	@Autowired
	UserService userService;
	
	@ModelAttribute
	public void addTitle(Model model) {
		model.addAttribute("title", "Oracle Advanced Benefits");
		model.addAttribute("headerMessage", "User Details");
	}
	

}
