package com.interview2.sboot.backend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

    @RequestMapping("/")
	public String index() {
		return "Congratulations from BlogController.java";
	}
	
}
