package com.vinsys.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinsys.model.Student;
import com.vinsys.repository.StudentRepositoy;
import com.vinsys.service.StudentService;

@Service
public class StudentServiceImplement implements StudentService {
	
	@Autowired
	private StudentRepositoy servicerepo;

	@Override
	public Student addStudentData(Student student) {
		// TODO Auto-generated method stub
		Student st=servicerepo.save(student);
		return st;
	}

	@Override
	public List<Student> getStudentData() {
		
		List<Student> st= servicerepo.findAll();
     
		return   st;
	}
}
