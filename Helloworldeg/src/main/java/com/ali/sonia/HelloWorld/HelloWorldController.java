package com.ali.sonia.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/")
	public String index()
	{
		return "Hello World, this is a Spring Boot";
	}
		
}
