package com.sri.sboot.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.sboot.crud.model.Person;
import com.sri.sboot.crud.repository.PersonRepository;

@Service
public class PersonService {

	
	@Autowired
	PersonRepository personRepository;
	
	public Iterable<Person> getAllPersons(){
		return personRepository.findAll();
	}
	
	public Person addPerson(Person p ) {
		return personRepository.save(p);
	}
	
	public Person getPersonBasedOnPhno(int pno) {
		return (personRepository.findById(pno)).get();
	}
	
	public void deletePerson(int phno) {
		personRepository.deleteById(phno);
	}
	
	public Person updatePerson(int pno, Person p) {
		return personRepository.save(p);
	} 
}
