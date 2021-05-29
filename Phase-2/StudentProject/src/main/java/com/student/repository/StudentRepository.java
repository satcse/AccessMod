package com.student.repository;

import org.springframework.data.repository.CrudRepository;

import com.student.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
