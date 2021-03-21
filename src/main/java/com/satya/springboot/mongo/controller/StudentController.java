package com.satya.springboot.mongo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.satya.springboot.mongo.model.Student;
// importing book repository
import com.satya.springboot.mongo.repository.StudentRepository;
import java.util.*;


@RestController
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@PostMapping("/saveStudentDetails")
	public String saveStudentDetails(@RequestBody Student studentdetails) {
		System.out.println("post method to save the student details");
		studentRepository.save(studentdetails);
		return "student details saved with id:"+studentdetails.getStudentId();
	}
	
	
	@GetMapping("/getStudentDetails")
	public List<Student> findStudentDetails() {
		System.out.println("get method for fetching all the books");
		return studentRepository.findAll();
		
	}
	
	@GetMapping("/getStudentDetails/{studentId}")
	public Optional<Student> findStudentDetailsByStudentId(@PathVariable("studentId") String studentId) {
		System.out.println("inside method to fetch the individual details of the student by studentId"+studentId);
		
		return studentRepository.findById(studentId);
		
		
	}
	
	@DeleteMapping("/studentDetails/{studentId}")
	public void deleteStudentByStudentId(@PathVariable("studentId") String studentId) {
		System.out.println("deleting the student record by studentId");
		studentRepository.deleteById(studentId);
	}

}
