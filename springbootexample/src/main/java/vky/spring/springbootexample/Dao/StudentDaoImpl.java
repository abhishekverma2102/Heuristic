package vky.spring.springbootexample.Dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import vky.spring.springbootexample.entities.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	private List<Student> list = new ArrayList<>(Arrays.asList(
			new Student(1, "Abhishek", "Mp", "Java", "Springboot"),
			new Student(2, "Naresh", "MH", "FE", "CSS"),
			new Student(3, "Mayuresh", "MH", "FE", "JS"),
			new Student(4, "Amar", "UP", "ROR", "Ruby")
			));

	@Override
	public List<Student> getAllStudents() {
		return list;
	}

	@Override
	public Student getStudent(String id) {
		return list.get(Integer.parseInt(id)-1);
	}
	
	@Override
	public boolean addStudent(Student student) {
		return list.add(student);
	}

	@Override
	public Student updateStudent(String id, Student student) {
		int uid = Integer.parseInt(id)-1;
		return list.set(uid, student);
	}

	@Override
	public Student deleteStudent(String id) {
		return list.remove(Integer.parseInt(id)-1);
	}
}
