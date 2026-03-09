package com.vinsys.service;

import java.util.List;

import com.vinsys.model.Student;

public interface StudentService {

	public Student addStudentData(Student student);
	public List<Student> getStudentData();
}
