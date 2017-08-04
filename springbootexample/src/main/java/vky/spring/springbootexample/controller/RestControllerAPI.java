package vky.spring.springbootexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import vky.spring.springbootexample.entities.Student;
import vky.spring.springbootexample.services.StudentService;

@RestController
public class RestControllerAPI {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/students", method=RequestMethod.GET)
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	} 

}
