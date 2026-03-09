package com.vinsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinsys.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
