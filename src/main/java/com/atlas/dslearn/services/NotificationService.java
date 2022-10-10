package com.atlas.dslearn.services;

import com.atlas.dslearn.dto.NotificationDTO;
import com.atlas.dslearn.entities.Notification;
import com.atlas.dslearn.entities.User;
import com.atlas.dslearn.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public Page<NotificationDTO> currentUser(Pageable pageable){
        User user = authService.authenticated();
        Page<Notification> page = notificationRepository.findByUser(user, pageable);

        return page.map(NotificationDTO::new);
    }
}
