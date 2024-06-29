package com.javafruit.repository;

import com.javafruit.model.TravelHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TravelHistoryRepository extends JpaRepository<TravelHistory, Long> {
}
