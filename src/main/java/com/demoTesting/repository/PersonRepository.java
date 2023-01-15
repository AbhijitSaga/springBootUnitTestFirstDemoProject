package com.demoTesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demoTesting.entitys.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {

	@Query("select case when count(p) >0 then true else false end from Person p where p.id=:id ")
	Boolean isPersonExistById(Integer id);

}
