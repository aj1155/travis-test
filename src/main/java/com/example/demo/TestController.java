package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author manki.kim
 */
@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("")
	public String test() {
		return "hello";
	}
}
