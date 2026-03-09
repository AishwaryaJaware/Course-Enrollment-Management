package com.vinsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinsys.model.Student;

@Repository
public interface StudentRepositoy extends JpaRepository<Student, Long>{
	

}
