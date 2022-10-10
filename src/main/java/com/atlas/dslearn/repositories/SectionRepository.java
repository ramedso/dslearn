package com.atlas.dslearn.repositories;

import com.atlas.dslearn.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Long> {
}
