package com.atlas.dslearn.repositories;

import com.atlas.dslearn.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
