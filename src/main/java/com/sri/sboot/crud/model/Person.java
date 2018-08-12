package com.sri.sboot.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(value= {"name","occupation","location","phno"})
@Entity
@Table(name="PERSON")
public class Person {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private int phno;
	private String name;
	private String occupation;
	private String location;
	
	public Person() {
		super();
	}
	
	public Person(int phno, String name, String occupation, String location) {
		super();
		this.phno = phno;
		this.name = name;
		this.occupation = occupation;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Person [phno=" + phno + ", name=" + name + ", occupation=" + occupation + ", location=" + location
				+ "]";
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
