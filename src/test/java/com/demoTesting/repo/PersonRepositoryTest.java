package com.demoTesting.repo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demoTesting.entitys.Person;
import com.demoTesting.repository.PersonRepository;

@SpringBootTest
public class PersonRepositoryTest {
	@Autowired
	PersonRepository personRepository;

	@Test
	void isPersonExistById() {

		Person person = new Person( "abhijt Sagar", "Supaul,bihar");
		personRepository.saveAndFlush(person);
		Boolean actualResult = personRepository.isPersonExistById(2);
		assertThat(actualResult).isTrue();
		System.out.println("is person exit");

	}
	
	@AfterEach
	void tearDown() {
		System.out.println("tearing Down");
		personRepository.deleteAll();
	}
	
	@BeforeEach
	void setUp() {
		System.out.println("setting up");
	}
}
