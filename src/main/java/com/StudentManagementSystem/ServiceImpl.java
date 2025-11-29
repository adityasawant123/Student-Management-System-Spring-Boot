package com.StudentManagementSystem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements StudentService{

	@Autowired
	Studentrepository Studentrepository; 
	
	public List<Student> getAllStudents() {
		
		return Studentrepository.findAll();
	}

	
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return Studentrepository.save(student);
	}


	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		return Studentrepository.findById(id).get();
	}


	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		Studentrepository.deleteById(id);
		
	}

}
