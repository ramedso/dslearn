package com.atlas.dslearn.repositories;

import com.atlas.dslearn.entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OfferRepository extends JpaRepository<Offer, Long> {
}
