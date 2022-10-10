package com.atlas.dslearn.repositories;

import com.atlas.dslearn.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
