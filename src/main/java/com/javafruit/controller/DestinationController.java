package com.javafruit.controller;

import com.javafruit.model.Destination;
import com.javafruit.service.DestinationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/destinations")
@AllArgsConstructor
@Slf4j
public class DestinationController {

    private DestinationService destinationService;

    @GetMapping
    public List<Destination> getAllDestinations() {
        log.info("enter");
        return destinationService.findAll();
    }

    @PostMapping
    public Destination createDestination(@RequestBody Destination destination) {
        log.info("enter");
        return destinationService.save(destination);
    }
}
