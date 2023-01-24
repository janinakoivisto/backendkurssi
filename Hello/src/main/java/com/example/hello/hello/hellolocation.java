package com.example.hello.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class hellolocation {

	
		
		@GetMapping("/hello")
		public String hello(@RequestParam("location") String location, @RequestParam("name")
			String name) {
			
			return "Welcome to the " + location + " " + name + "!";
			
		}
		
		
		
		
	}
	

