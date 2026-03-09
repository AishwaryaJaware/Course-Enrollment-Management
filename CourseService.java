package com.vinsys.service;

import java.util.List;

import com.vinsys.model.Course;

public interface CourseService {
	
	public List<Course> findAllCourses();
	public Course saveCourses(Course course);
	
}
