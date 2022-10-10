package com.atlas.dslearn.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_section")
public class Section implements Serializable {

   @Serial
   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
   private String title;
   private String description;
   private Integer position;
   private String imgUri;

   @ManyToOne
   @JoinColumn(name = "resource_id")
   private Resource resource;

   @ManyToOne
   @JoinColumn(name = "prerequisite_id")
   private Section prerequisite;
}
