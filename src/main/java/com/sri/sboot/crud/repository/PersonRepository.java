package com.sri.sboot.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sri.sboot.crud.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
