package fi.malm.eka_tehtava.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@ResponseBody
	
	@RequestMapping("index")
	
	public String returnMain() {
		return "This is the main page";
	}
}