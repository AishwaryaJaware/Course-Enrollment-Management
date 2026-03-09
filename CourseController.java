package com.vinsys.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinsys.model.Course;
import com.vinsys.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	// @Autowired
	private final CourseService courseservice;

	public CourseController(CourseService courseservice) {

        this.courseservice = courseservice;


	}

	@GetMapping("/getAllCourses")
	public List<Course> getAll() {


        return courseservice.findAllCourses();


	}

	@PostMapping("/addNewCourse")
	public Course addCourse(@RequestBody Course course) {

        return courseservice.saveCourses(course);
	}
}
