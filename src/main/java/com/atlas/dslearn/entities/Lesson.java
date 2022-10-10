package com.atlas.dslearn.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_lesson")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Lesson implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer position;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @Setter(AccessLevel.NONE)
    @OneToMany(mappedBy = "lesson")
    private final List<Deliver> deliveries = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "tb_lessons_done",
            joinColumns = @JoinColumn(name = "lesson_id"),
            inverseJoinColumns = {
                    @JoinColumn(name = "user_id"),
                    @JoinColumn(name = "offer_id")
            }
    )
    @Setter(AccessLevel.NONE)
    private final Set<Enrollment> enrollmentsDone = new HashSet<>();
}
