package com.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.exceptions.StudentNotFoundException;
import com.student.model.Student;
import com.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudents()
	{
		List<Student> students = new ArrayList<Student>();
		studentRepository.findAll().forEach(student -> students.add(student));
		return students;
	}
	
	public Student getStudentById(int id)
	{
		Optional<Student> student = studentRepository.findById(id);
		if(student.isPresent())
			return studentRepository.findById(id).get();
		else
			  throw new StudentNotFoundException();
	}
	
	public void saveOrUpdate(Student student)
	{
		studentRepository.save(student);
	}
	
	public void delete(int id)
	{
		studentRepository.deleteById(id);
	}
}
