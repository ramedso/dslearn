package com.atlas.dslearn.repositories;

import com.atlas.dslearn.entities.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
}
