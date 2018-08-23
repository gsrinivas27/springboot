package com.sri.sboot.crud.model;

import javax.persistence.Embeddable;

@Embeddable
public class Course {

	private String courseName;
	private Long coursePrice;
	
	
	public Course() {
		super();
	}
	
	public Course(String courseName, Long coursePrice) {
		super();
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}
	
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", coursePrice=" + coursePrice + "]";
	}

	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public Long getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(Long coursePrice) {
		this.coursePrice = coursePrice;
	}
	
	
}
