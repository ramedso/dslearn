package com.atlas.dslearn.repositories;

import com.atlas.dslearn.entities.Enrollment;
import com.atlas.dslearn.entities.pk.EnrollmentPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, EnrollmentPK> {
}
