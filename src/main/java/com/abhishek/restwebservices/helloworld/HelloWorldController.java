package com.abhishek.restwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*REST API*/

@RestController
public class HelloWorldController {
	
	@GetMapping( path="/hello-world")
	public String helloWorld() {
		return "Hello World !";
	}
	
	@GetMapping( path="/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}

}
