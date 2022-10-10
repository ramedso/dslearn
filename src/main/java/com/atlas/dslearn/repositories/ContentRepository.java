package com.atlas.dslearn.repositories;

import com.atlas.dslearn.entities.Content;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContentRepository extends JpaRepository<Content, Long> {
}
