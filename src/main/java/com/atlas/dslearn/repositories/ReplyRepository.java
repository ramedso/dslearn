package com.atlas.dslearn.repositories;

import com.atlas.dslearn.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
