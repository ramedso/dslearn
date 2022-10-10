package com.atlas.dslearn.entities;

import com.atlas.dslearn.entities.pk.EnrollmentPK;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_enrollment")
public class Enrollment implements Serializable {

   @Serial
   private static final long serialVersionUID = 1L;

   @EmbeddedId
   private EnrollmentPK id = new EnrollmentPK();
   @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
   private Instant enrollMoment;
   @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
   private Instant refundMoment;
   private boolean available;
   private boolean onlyUpdate;

   @ManyToMany(mappedBy = "enrollmentsDone")
   private Set<Lesson> lessonsDone = new HashSet<>();

   public Enrollment(User user, Offer offer, EnrollmentPK id, Instant enrollMoment, Instant refundMoment,
                     boolean available, boolean onlyUpdate) {
      id.setUser(user);
      id.setOffer(offer);
      this.enrollMoment = enrollMoment;
      this.refundMoment = refundMoment;
      this.available = available;
      this.onlyUpdate = onlyUpdate;
   }

   public User getStudent(){
      return id.getUser();
   }

   public void setStudent(User user){
      id.setUser(user);
   }

   public Offer getOffer(){
      return id.getOffer();
   }

   public void getOffer(Offer offer){
      id.setOffer(offer);
   }
}
