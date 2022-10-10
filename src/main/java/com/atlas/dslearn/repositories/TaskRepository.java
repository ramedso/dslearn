package com.atlas.dslearn.repositories;

import com.atlas.dslearn.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
