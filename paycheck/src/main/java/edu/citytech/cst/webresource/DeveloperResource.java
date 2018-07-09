package edu.citytech.cst.webresource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloperResource {
	
	@RequestMapping("/author")
	public String getName() {
		return "Lopez,Esmelin";
	}

}
