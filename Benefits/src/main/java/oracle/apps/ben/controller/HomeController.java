package oracle.apps.ben.controller;

import javax.servlet.ServletConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ServletConfigAware;
import org.springframework.web.servlet.ModelAndView;

import oracle.apps.ben.model.User;
import oracle.apps.ben.service.UserService;

@Controller
public class HomeController  implements ServletConfigAware{
	
	@Autowired
	UserService userService;
	
	private ServletConfig servletConfig;
	
	@RequestMapping(path="/", method= RequestMethod.GET)
	public String getHomePage() {
		System.out.println("HomePage method called..");
		return "index";
	}
	
	@ModelAttribute
	public void addTitle(Model model) {
		model.addAttribute("title", "Oracle Advanced Benefits");
		model.addAttribute("headerMessage", "User Details");
	}
	
	@RequestMapping(path="/userInfo",method = RequestMethod.GET)
	public ModelAndView getUserInfo() {
		
		String userId = servletConfig.getInitParameter("personId");
		User user = userService.getUserInfo(userId);
		ModelAndView mv = new ModelAndView("userInfo");
		mv.addObject("user", user);
		return mv;
	}

	public void setServletConfig(ServletConfig servletConfig) {
		this.servletConfig = servletConfig;
	}
}
