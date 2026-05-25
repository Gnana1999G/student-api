package com.itsaga.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itsaga.student.model.Student;

@Service
public class StudentService {
	List<Student> students=new ArrayList<Student>();
	public StudentService() {
		students.add(new Student(12, "Gnana", "Backend", 10000.0));
		students.add(new Student(27, "Mouni", "SQLDev", 7000.0));
		students.add(new Student(47, "Raghava", "React", 5000.0));
		students.add(new Student(53, "Charan", "Java", 10000.0));
		students.add(new Student(18, "Sai", "DataScience", 17000.0));
	}
	
	public List<Student> getStudents(){
		return students;
	}
	public void addStudent(Student student) {
		students.add(student);
	}
	public Student getStudent(int id) {
		return students.stream().filter(s ->s.getId()==id)
				.findFirst()
				.orElse(null);
	}
	
	public boolean removeStudent(int id) {
		return students.removeIf(s->s.getId()==id);
	}
	public boolean updateStudent(int id,Student student) {
		for(Student s:students) {
			if(s.getId()==id) {
				s.setName(student.getName());
				s.setCourse(student.getCourse());
				s.setFee(student.getFee());
				return true;
			}
		}
		return false;
	}

}
