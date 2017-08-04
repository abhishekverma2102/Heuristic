package vky.spring.springbootexample.Dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import vky.spring.springbootexample.entities.Student;

@Repository
public class StudentDao {
	
	private List<Student> list = new ArrayList<>(Arrays.asList(
			new Student(1, "Abhishek", "Mp", "Java", "Springboot"),
			new Student(2, "Naresh", "MH", "FE", "CSS"),
			new Student(3, "Mayuresh", "MH", "FE", "JS"),
			new Student(4, "Amar", "UP", "ROR", "Ruby")
			));
	
	public List<Student> getAllStudents(){
		return list;
	}

}
