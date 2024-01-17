package in.uddesh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.uddesh.entity.Registration;
import in.uddesh.repositories.CounselloreServiceRepo;

@Controller
public class CounselloreController {
	
	private CounselloreServiceRepo crepo;
	
	@GetMapping("/registration")
	public String registration(Model model) {
		model.addAttribute("reg",new Registration());
		
		return "registrationview";
	}

}
