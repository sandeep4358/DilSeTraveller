package com.javafruit.service;

import com.javafruit.model.Destination;
import com.javafruit.repository.DestinationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DestinationService {

    private DestinationRepository destinationRepository;

    public List<Destination> getAllDestinations() {
        return destinationRepository.findAll();
    }

    public Destination saveDestination(Destination destination) {
        return destinationRepository.save(destination);
    }
}

