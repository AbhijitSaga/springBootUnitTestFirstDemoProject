package com.demoTesting.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.demoTesting.repository.PersonRepository;

public class PersonService {

	@Autowired
	PersonRepository personRepository;
	
	public Boolean getAllPerson(Integer id) {
		return this.personRepository.isPersonExistById( id);
	}

	public PersonService(PersonRepository personRepository) {
		super();
		this.personRepository = personRepository;
	}

}
