package com.vinsys.service;

import java.util.List;

import com.vinsys.model.Course;
import com.vinsys.model.Enrollment;

public interface EnrollmentService {
	public Enrollment addEnrollmentData(Enrollment enrollment);
	public Enrollment enrollStudent(int studentId, long courseId);
	public List<Enrollment> getAllEnrollments();

	
}


