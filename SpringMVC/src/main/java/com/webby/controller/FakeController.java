package com.webby.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FakeController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/fake.app")
	public ResponseEntity<String> fakeMethod() {
		return new ResponseEntity<>("this is a fake response, but from a real controller setup.",HttpStatus.OK);
	}
	
	
}
