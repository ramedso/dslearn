package com.atlas.dslearn.services;

import com.atlas.dslearn.dto.DeliverRevisionDTO;
import com.atlas.dslearn.entities.Deliver;
import com.atlas.dslearn.repositories.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverService {

    @Autowired
    private DeliverRepository deliverRepository;

    @Transactional
    public void saveRevision(Long deliverId, DeliverRevisionDTO dto) {
        Deliver deliver = deliverRepository.getReferenceById(deliverId);
        deliver.setStatus(dto.getStatus());
        deliver.setFeedback(dto.getFeedback());
        deliver.setCorrectCount(dto.getCorrectCount());
        deliverRepository.save(deliver);
    }
}
