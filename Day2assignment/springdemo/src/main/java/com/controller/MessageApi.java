package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageApi {
	@GetMapping(value="/showmessage") 
	String displayMessage() {

		return "Hello";

	}
}
