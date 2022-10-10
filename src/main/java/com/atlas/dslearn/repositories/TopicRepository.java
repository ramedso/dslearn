package com.atlas.dslearn.repositories;

import com.atlas.dslearn.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
