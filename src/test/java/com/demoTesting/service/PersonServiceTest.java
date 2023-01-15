package com.demoTesting.service;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demoTesting.repository.PersonRepository;
import com.demoTesting.services.PersonService;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
	@Mock
	private PersonRepository personRepository;

	private PersonService personService;

	@BeforeEach
	void setUp() {
		this.personService = new PersonService(this.personRepository);
	}

	@Test
	void getAllPersion() {
		//this are not work because i am pass number in getAllPersion() method
		personService.getAllPerson(1);
		verify(personRepository).findAll();
	}
}
