package com.javafruit.controller;

import com.javafruit.model.Destination;
import com.javafruit.service.DestinationService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/destinations")
@AllArgsConstructor
public class DestinationController {

    private DestinationService destinationService;

    @GetMapping
    public List<Destination> getAllDestinations() {
        return destinationService.getAllDestinations();
    }

    @PostMapping
    public Destination createDestination(@RequestBody Destination destination) {
        return destinationService.saveDestination(destination);
    }
}
