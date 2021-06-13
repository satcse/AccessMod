package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.exceptions.StudentNotFoundException;
import com.student.model.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/student")
	private List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}
	
	
	@GetMapping("/student/{id}")
	private Student getStudent(@PathVariable("id") int id)
	{

		return studentService.getStudentById(id);		
	}

	@PostMapping("/student")
	private int saveStudent(@RequestBody Student student)
	{
		studentService.saveOrUpdate(student);
		return student.getId();
	}
	
	@DeleteMapping("/student/{id}")
	private void deleteStudent(@PathVariable("id") int id)
	{
		studentService.delete(id);
	}
	
}
