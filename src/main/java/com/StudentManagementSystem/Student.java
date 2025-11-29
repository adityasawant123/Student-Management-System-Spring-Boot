package com.StudentManagementSystem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	@Column(name="first_name")
	String firstName;
	
	@Column(name="last_name")
	String lastName;
	
	@Column(name="email")
	String email;

	
	
	public Student() {
		super();
		this.firstName = "default";
		this.lastName = "default";
		this.email = "abc@gmail.com";
	}



	public Student(int id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}
