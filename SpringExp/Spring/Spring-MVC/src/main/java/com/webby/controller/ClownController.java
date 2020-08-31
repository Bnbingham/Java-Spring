package com.webby.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webby.dao.ClownDao;
import com.webby.model.ConfusedClowns;

@Controller
public class ClownController {

	
	private ClownDao cd;
	
	@Autowired
	public ClownController(ClownDao c) {
		this.cd=c;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/clowns.app")
	public ResponseEntity<List<ConfusedClowns>> getAll(){
		return new ResponseEntity<>(cd.getAll(), HttpStatus.OK);
	}
	
	
}
