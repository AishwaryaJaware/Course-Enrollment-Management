package com.vinsys.serviceImplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinsys.model.Course;
import com.vinsys.model.Enrollment;
import com.vinsys.model.Student;
import com.vinsys.repository.CourseRepository;
import com.vinsys.repository.EnrollmentRepositary;
import com.vinsys.repository.StudentRepositoy;
import com.vinsys.service.EnrollmentService;
@Service
public class EnrollmentServiceImplement  implements EnrollmentService {
	
	
		@Autowired
		private EnrollmentRepositary enrollmentRepository;
		@Autowired
		private StudentRepositoy studentRepository;
		@Autowired
		private CourseRepository courseRepository;

		@Override
		public Enrollment addEnrollmentData(Enrollment enrollment) {
			Enrollment en=enrollmentRepository.save(enrollment);
			return en;
		}


		@Override
		public Enrollment enrollStudent(int studentId, long courseId) {
			 Student student = studentRepository.findById((long) studentId).orElseThrow();
		        Course course = courseRepository.findById(courseId).orElseThrow();

		        Enrollment enrollment = new Enrollment();
		        enrollment.setStudent(student);
		        enrollment.setCourse(course);

		        return enrollmentRepository.save(enrollment);
		}

		
		@Override
		public List<Enrollment> getAllEnrollments() {
			
			return enrollmentRepository.findAll();
		}
	}



