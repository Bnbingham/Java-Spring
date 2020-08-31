package com.webby.controller;

import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import org.aspectj.apache.bcel.generic.SwitchBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webby.dao.ClownDao;
import com.webby.model.ConfusedClowns;

@Controller
@RequestMapping("/clowns/")
public class ClownController {

	
	private ClownDao cd;
	
	@Autowired
	public ClownController(ClownDao c) {
		this.cd=c;
	}
	
	/*
	 *
	 * request mapping will tell spring mvc what methods and urls are mapped
	 * to the method. You can also put it above the class to have an entire
	 * class mapped to a singular uri
	 * 
	 * Response entity is a class used to build an entire response
	 * 
	 */
	
	//http://localhost:8080/SpringMVC/clowns.app
	@RequestMapping(method = RequestMethod.GET, value = "/clowns.app")
	public ResponseEntity<List<ConfusedClowns>> getAll(){
		return new ResponseEntity<>(cd.getAll(), HttpStatus.OK);
	}
	
	/*
	 * 
	 *We can shorten how much informations we have to give for mapping
	 *methods to urls by using getmapping annotations. we also have
	 *mapping annotations for the remainder of the http methods (post,
	 *put, delete, etc.).
	 *
	 * we can use @ResponseBody for the return typeto just throw something
	 * in the body of the response instead of building the entire response
	 * with response entity.
	 * 
	 */
	
	//http method mapping for shorter @annotations that RequestMapping
	//@PathVariable for using url as variable for method
	@GetMapping("{id}/id.app")
	public @ResponseBody ConfusedClowns getById(@PathVariable String id){
		int max = cd.getAll().size();
//		String isNumber = "[^\d]*";
		try {
			int idAsInt = Integer.parseInt(id);
			if(idAsInt>max)
				return null;
			else {
				return cd.findById(idAsInt);
			}
		} catch (NumberFormatException e) {
			return null;
		}
	}
	

	//@RequestHeader(value="") for using header variable
	@GetMapping("/dementia.app")
	public @ResponseBody List<ConfusedClowns> getByDemetia(@RequestHeader("dementia") String hasDementia) {
		
		switch (hasDementia) {
		case "true":
			return cd.findAllByDimensia(true);
		case "false":
			return cd.findAllByDimensia(false);
		default:
			return null;
		}
		
	}
	/*
	 * what i want:
	 * 	get a confused clown by id by designating the id
	 * 	in the url (ex: clowns/3/id.app should give the json
	 * 	of the clown with id of 3).
	 * 
	 * 	create a method with the proper url mapping so that 
	 * 	we can get a list of clowns by if they have dementia.
	 * 	the boolean should be put in the request headers, you
	 * 	should get the boolean from the headers and put the list
	 * 	in the response body.
	 */
	
}