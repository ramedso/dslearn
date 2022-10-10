package com.atlas.dslearn.dto;

import com.atlas.dslearn.entities.Notification;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NotificationDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String text;
    private Instant moment;
    private boolean read;
    private String route;
    private Long userId;

    public NotificationDTO(Notification entity) {
        id = entity.getId();
        text = entity.getText();
        moment = entity.getMoment();
        read = entity.isRead();
        route = entity.getRoute();
        userId = entity.getUser().getId();
    }
}
