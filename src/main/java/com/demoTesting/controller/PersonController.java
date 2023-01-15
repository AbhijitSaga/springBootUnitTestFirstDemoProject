package com.demoTesting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.demoTesting.services.PersonService;

public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping(value = "/persons")
	public ResponseEntity<?> getAllPerson(@PathVariable Integer person_id){
		return ResponseEntity.ok(personService.getAllPerson(person_id));
		
	}
	
}
