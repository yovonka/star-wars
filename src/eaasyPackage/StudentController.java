package eaasyPackage;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("user",new User());
		return "user-form";
	}
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("user") User theUser, BindingResult theResult) {
		System.out.println("theUser: |"+ theUser.getLastName()+"|");
		if (theResult.hasErrors()) {
			return "user-form";
		}
		else return "user-config";
	}
	// ignore withe space method
	@InitBinder 
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
}
