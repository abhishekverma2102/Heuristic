package vky.spring.springbootexample.services;

import java.util.List;

import vky.spring.springbootexample.entities.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student getStudent(String id);

	boolean addStudent(Student student);

	Student updateStudent(String id, Student student);

	Student deleteStudent(String id);

}