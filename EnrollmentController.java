package com.vinsys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vinsys.model.Enrollment;
import com.vinsys.service.EnrollmentService;

@RestController
@RequestMapping("/enrollment")
public class EnrollmentController {
	 
	@Autowired
	private EnrollmentService enrollmentService;
	
	@PostMapping("/enroll")
    public Enrollment enroll(@RequestParam int studentId, @RequestParam long courseId) {
        return enrollmentService.enrollStudent(studentId, courseId);
    }

    @GetMapping("/getAallEnrollment")
    public List<Enrollment> getAll() {
        return enrollmentService.getAllEnrollments();
    }
	

}
