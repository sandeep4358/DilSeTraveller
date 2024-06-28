package com.javafruit.service;

import com.javafruit.model.TravelHistory;
import com.javafruit.repository.TravelHistoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class TravelHistoryService {

    private TravelHistoryRepository travelHistoryRepository;

    public List<TravelHistory> getAllTravelHistories() {
        return travelHistoryRepository.findAll();
    }

    public TravelHistory saveTravelHistory(TravelHistory travelHistory) {
        return travelHistoryRepository.save(travelHistory);
    }
}
