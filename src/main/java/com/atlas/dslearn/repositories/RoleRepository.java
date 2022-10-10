package com.atlas.dslearn.repositories;

import com.atlas.dslearn.entities.Role;
import com.atlas.dslearn.entities.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
