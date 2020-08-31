package com.webby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ViewController {
	@RequestMapping(method= RequestMethod.GET, value = "/home.app")
	public String goHome() {
//		return "html/index.html";
		return "index";
	}
	@RequestMapping(method= RequestMethod.GET, value = "/next.app")
	public String goNext() {
//		return "html/next.html";
		return "next";
	}
}
