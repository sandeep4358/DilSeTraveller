package com.javafruit.service;

import com.javafruit.model.TravelHistory;
import com.javafruit.repository.TravelHistoryRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)

class TravelHistoryServiceTest {

    @Mock
    private TravelHistoryRepository travelHistoryRepository;

    @InjectMocks
    private TravelHistoryService travelHistoryService;



    @Test
    void getAllTravelHistories() {
        TravelHistory usaItinerary = TravelHistory.builder()
                .id(12L)
                .travelerName("USA Itinerary")
                .travelDate(LocalDate.of(2023, 2, 20))
                .build();
        TravelHistory japanItinerary = TravelHistory.builder()
                .id(11L)
                .travelerName("JAPAN Itinerary")
                .travelDate(LocalDate.of(2023, 3, 12))
                .build();

        List<TravelHistory> list = new ArrayList<>();
        list.add(usaItinerary);
        list.add(japanItinerary);

        Mockito.when(travelHistoryRepository.findAll()).thenReturn(list);

        //when
        List<TravelHistory> allTravelHistories = travelHistoryService.getAllTravelHistories();

        //then
        Assertions.assertEquals(2,allTravelHistories.size());

        Assertions.assertEquals(LocalDate.of(2023, 3, 12),list.get(1).getTravelDate());

        Assertions.assertEquals(LocalDate.of(2023,2,20),list.get(0).getTravelDate());

    }

    @Test
    void getTravelHistoryById() {
        TravelHistory usaItinerary = TravelHistory.builder()
                .id(12L)
                .travelerName("USA Itinerary")
                .travelDate(LocalDate.of(2023, 2, 20))
                .build();

        Mockito.when(travelHistoryRepository.findById(12L)).thenReturn(Optional.ofNullable(usaItinerary));

        //when
        TravelHistory travelHistoryById = travelHistoryService.getTravelHistoryById(12L);
        // then
        Assertions.assertEquals(travelHistoryById.getTravelerName(), Objects.requireNonNull(usaItinerary).getTravelerName());
    }

    @Test
    void saveTravelHistory() {

        TravelHistory canadaItinerary = TravelHistory.builder().travelerName("Canada Itinerary").travelDate(LocalDate.of(2023, 4, 12)).build();

        Mockito.when(travelHistoryRepository.save(canadaItinerary)).thenReturn(canadaItinerary);

        //when
        TravelHistory travelHistory = travelHistoryService.saveTravelHistory(canadaItinerary);

        //then
        Assertions.assertEquals(travelHistory.getTravelerName(),canadaItinerary.getTravelerName());

        Assertions.assertEquals(travelHistory.getTravelDate(),canadaItinerary.getTravelDate());


    }

    @Test
    void deleteById() {
            //Given
        Long id = 1L;
        //When
        travelHistoryService.deleteById(id);
        //Then
        Mockito.verify(travelHistoryRepository,Mockito.times(1)).deleteById(1L);
    }
}