package vky.spring.springbootexample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vky.spring.springbootexample.Dao.StudentDao;
import vky.spring.springbootexample.entities.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public List<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}
}
