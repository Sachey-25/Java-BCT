package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	//Get HTTP method
	//http://locahost:8080/helloworld -- URI
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World";
	}
}
