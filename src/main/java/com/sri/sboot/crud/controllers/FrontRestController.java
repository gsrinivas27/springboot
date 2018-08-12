package com.sri.sboot.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sri.sboot.crud.model.Person;
import com.sri.sboot.crud.service.PersonService;

@RestController
public class FrontRestController {
	
	@Autowired
	PersonService personService;

	@GetMapping(value="/")
	public String rootPath() {
		return "This is root path";
	}
	
	@GetMapping(value="/all")
	public Iterable<Person> getAllPersons(){
		return personService.getAllPersons();
	}
	
	@PostMapping("/add")
	public Person addPerson(@RequestBody Person p ) {
		return personService.addPerson(p);
	}
	
	@GetMapping("/person/{phno}")
	public Person getPersonBasedOnPhno(@PathVariable("phno") int pno) {
		return (personService.getPersonBasedOnPhno(pno));
	}
	
	@DeleteMapping("/person/{pno}")
	public void deletePerson(@PathVariable("pno") int phno) {
		personService.deletePerson(phno);
	}
	
	@PutMapping("/person/{phno}")
	public Person updatePerson(@PathVariable("phno") int pno, @RequestBody Person p) {
		return personService.updatePerson(pno,p);
	}
	@ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
	public String handleHttpMediaTypeNotAcceptableException() {
		 return "acceptable MIME type(s):" + MediaType.APPLICATION_JSON_VALUE +","+MediaType.APPLICATION_XML_VALUE;
	}
	
	@ExceptionHandler(java.util.NoSuchElementException.class)
	public String handleNoSuchElementException() {
		return "Requested Data Not Found";
	}
	
	/*@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String handleNoHandlerMapping() {
		return "No Mapping Found";
	}*/
}
