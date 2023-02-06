package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("test2")
	public String test3() {
		System.out.println("????????");
		return "test4";
	}
}
