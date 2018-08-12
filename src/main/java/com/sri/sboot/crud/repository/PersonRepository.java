package com.sri.sboot.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.sri.sboot.crud.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer>{

}
