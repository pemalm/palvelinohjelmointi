package fi.malm.hello.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@ResponseBody
	
	@RequestMapping("hello")
	
	public String returnHello(
			@RequestParam(name = "name", defaultValue = "") String name,
			@RequestParam(name = "location", defaultValue = "") String location
			) 
	{
		return "Welcome to the " + location + ", " + name + "!";
	}

}