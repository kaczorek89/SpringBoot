package com.example.vaadin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HalloWorldController {

	@RequestMapping("/")
	public String index(){
		return "Hallo World";
	}
	
}
