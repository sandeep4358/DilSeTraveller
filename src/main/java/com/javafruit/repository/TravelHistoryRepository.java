package com.javafruit.repository;

import com.javafruit.model.TravelHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelHistoryRepository extends JpaRepository<TravelHistory, Long> {
}
