package eaasyPackage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MainController {

	@RequestMapping("/")
	public String setMainPage() {
		return "main-page";
	}
	@RequestMapping("/privFormProcess")
	public String improveDealWithForm(@RequestParam("userName") String theName, Model model) {
				
		model.addAttribute("message",theName+"Jedi");	
		return  "second-page";	
	}
	
}
