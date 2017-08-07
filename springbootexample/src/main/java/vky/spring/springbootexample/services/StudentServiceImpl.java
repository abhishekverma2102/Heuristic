package vky.spring.springbootexample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vky.spring.springbootexample.Dao.StudentDao;
import vky.spring.springbootexample.entities.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}

	@Override
	public Student getStudent(String id) {
		return studentDao.getStudent(id);
	}

	@Override
	public boolean addStudent(Student student) {
		return studentDao.addStudent(student);
	}

	@Override
	public Student updateStudent(String id, Student student) {
		return studentDao.updateStudent(id, student);
	}

	@Override
	public Student deleteStudent(String id) {
		return studentDao.deleteStudent(id);
	}
}
