package com.vinsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinsys.model.Enrollment;

@Repository
public interface EnrollmentRepositary extends JpaRepository<Enrollment, Long> {

}
