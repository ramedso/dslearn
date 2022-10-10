package com.atlas.dslearn.repositories;

import com.atlas.dslearn.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
