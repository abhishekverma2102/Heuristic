package vky.spring.springbootexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@RequestMapping(value="/students/{id}", method=RequestMethod.GET)
	public Student getStudent(@PathVariable String id) {
		return studentService.getStudent(id);
	} 
	
	@RequestMapping(value="/students", method=RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	} 
	
	@RequestMapping(value="/students/{id}", method=RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Student updateStudent(@PathVariable String id, @RequestBody Student student) {
		return studentService.updateStudent(id, student);
	} 

	@RequestMapping(value="/students/{id}", method=RequestMethod.DELETE)
	public Student deleteStudent(@PathVariable String id) {
		return studentService.deleteStudent(id);
	} 
}
