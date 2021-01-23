package fi.malm.eka_tehtava.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {
	@ResponseBody
	
	@RequestMapping("contact")
	
	public String returnContact() {
		return "This is the contact page";
	}
}
