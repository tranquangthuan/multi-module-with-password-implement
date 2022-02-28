package com.maven.trainning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maven.trainning.password.PasswordService;

@RestController
public class HomeController {

	@Autowired
	private PasswordService passwordService;

	@GetMapping(path = "index")
	public String index() {
		System.out.println("index method");
		return passwordService.algorithm();
	}
}
