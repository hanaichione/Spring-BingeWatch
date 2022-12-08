package com.pro.jung.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/java")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("helloworld!!");
	}
	
	@RequestMapping("/web")
	public String reHello() {
		return "helloworld!!!!!";
	}

}
