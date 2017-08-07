package vky.spring.springbootexample.Dao;

import java.util.List;

import vky.spring.springbootexample.entities.Student;

public interface StudentDao {

	List<Student> getAllStudents();

	Student getStudent(String id);

	boolean addStudent(Student student);

	Student updateStudent(String id, Student student);

	Student deleteStudent(String id);

}