package com.javafruit.service;

import com.javafruit.model.Destination;
import com.javafruit.repository.DestinationRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class DestinationService {

    private final DestinationRepository destinationRepository;


    private static final  String ENTER = "enter";
    public Destination findById(Long id) {
        log.info(ENTER);
        return destinationRepository.findById(id).orElse(null);
    }

    public List<Destination> findAll() {
        log.info(ENTER);
        return destinationRepository.findAll();
    }

    public Destination save(Destination destination) {
        log.info(ENTER);
        // Business logic can be added here before saving
        return destinationRepository.save(destination);
    }

    public void deleteById(Long id) {
        log.info(ENTER);
        destinationRepository.deleteById(id);
    }

}

