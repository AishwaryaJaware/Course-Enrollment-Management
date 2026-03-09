package com.vinsys.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinsys.model.Course;
import com.vinsys.repository.CourseRepository;
import com.vinsys.service.CourseService;

@Service
public class CourseServiceImplement implements CourseService {
	
	@Autowired
	private CourseRepository CourseRepository;
	

	@Override
	public List<Course> findAllCourses() {
		// TODO Auto-generated method stub
		return CourseRepository.findAll();
	}

	@Override
	public Course saveCourses(Course course) {
		
		return CourseRepository.save(course);
	}

}
