package com.javafruit.service;

import com.javafruit.model.TravelHistory;
import com.javafruit.repository.TravelHistoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TravelHistoryService {

    private final  TravelHistoryRepository travelHistoryRepository;

    public List<TravelHistory> getAllTravelHistories() {
        return travelHistoryRepository.findAll();
    }

    public TravelHistory getTravelHistoryById(Long id){
        return  travelHistoryRepository.findById(id).orElse(null);
    }

    public TravelHistory saveTravelHistory(TravelHistory travelHistory) {
        return travelHistoryRepository.save(travelHistory);
    }

    public void deleteById(Long id){
        travelHistoryRepository.deleteById(id);
    }
}
