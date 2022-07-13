package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpController {
	
	@GetMapping("/hello")
	public String hello()
	{
		return "Hello World!!";
	}

}
