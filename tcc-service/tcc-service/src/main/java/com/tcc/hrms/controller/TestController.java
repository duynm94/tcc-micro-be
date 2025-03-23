package com.tcc.hrms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcc.hrms.dto.TestDTO;
import com.tcc.hrms.service.TestService;

@RestController
@RequestMapping("/hrms")
public class TestController {

	@Autowired
	private TestService service;

	@GetMapping("/gs")
	public String greetingMessage() {
		return "Greeting Message TEST!";
	}

	@GetMapping("/test")
	public TestDTO test(@RequestParam int id) {
		TestDTO obj = service.test(id);
		return obj;
	}

}
