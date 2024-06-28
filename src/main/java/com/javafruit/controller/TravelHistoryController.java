package com.javafruit.controller;

import com.javafruit.model.TravelHistory;
import com.javafruit.service.TravelHistoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/travel-histories")
@AllArgsConstructor
public class TravelHistoryController {

    private TravelHistoryService travelHistoryService;

    @GetMapping
    public List<TravelHistory> getAllTravelHistories() {
        return travelHistoryService.getAllTravelHistories();
    }

    @PostMapping
    public TravelHistory createTravelHistory(@RequestBody TravelHistory travelHistory) {
        return travelHistoryService.saveTravelHistory(travelHistory);
    }
}
