package com.atlas.dslearn.resources;

import com.atlas.dslearn.dto.NotificationDTO;
import com.atlas.dslearn.services.NotificationService;
import com.atlas.dslearn.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationResources {

    @Autowired
    private NotificationService notificationService;
    
    @GetMapping
    public ResponseEntity<Page<NotificationDTO>> currentUser(Pageable pageable) throws ResourceNotFoundException {
        Page<NotificationDTO> page = notificationService.currentUser(pageable);
        return ResponseEntity.ok().body(page);
    }
}
