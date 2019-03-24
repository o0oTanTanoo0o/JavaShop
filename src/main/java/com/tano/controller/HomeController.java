package com.tano.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/abc")
	public String Main() {
		return "redirect:hello";
	}
	
	@RequestMapping("/hello")
	public String Hello() {
		return "hello";
	}
}
