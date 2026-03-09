package com.vinsys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinsys.model.Student;
import com.vinsys.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	
	@PostMapping("/studentAdd")
	public Student  registerStudent(@RequestBody Student student) {
		Student st=studentService.addStudentData(student);
		return st;
	}
	
	@GetMapping("/getAllStudet")
	public List<Student>showStudentData() {
		return  studentService.getStudentData();
		
	}
	
	
	
	

}
