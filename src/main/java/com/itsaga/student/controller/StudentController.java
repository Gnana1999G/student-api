package com.itsaga.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itsaga.student.model.Student;
import com.itsaga.student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return service.getStudents();
	}
	
	@PostMapping("/students")
	public String addStudent(@RequestBody Student student) {
		service.addStudent(student);
		return "student added successfully";
	}
	
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.getStudent(id);
	}
	@DeleteMapping("/students/{id}")
	public ResponseEntity<String> deleteStudent(@PathVariable int id) {
		
		boolean removed=service.removeStudent(id);
		if(removed) {
			return ResponseEntity.ok("Student deleted");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
		}
	}
	
	@PutMapping("/students/{id}")
	public ResponseEntity<String> updateStudent(@PathVariable int id,@RequestBody Student s){
		boolean updated=service.updateStudent(id, s);
		if(updated) {
			return ResponseEntity.ok("Student updated successfully");
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Student not found");
		}
	}

}

/*

@RequestBody

Spring converts incoming JSON → Java object automatically.

@PathVariable

Reads value from URL.
*/