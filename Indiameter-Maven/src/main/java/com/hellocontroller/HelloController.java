package com.hellocontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String displayData()
	{
		return "Hello-World";
	}
	
	@RequestMapping("/data")
	public String dataDisplay()
	{
		return "Hello, This is Indiameter project";
	}

}