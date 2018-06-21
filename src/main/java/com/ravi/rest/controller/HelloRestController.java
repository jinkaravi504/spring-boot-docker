package com.ravi.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloRestController {

	@GetMapping
	public String getHelloMessage() {
		return "My First Spring-Boot-Docker";
	}
}
