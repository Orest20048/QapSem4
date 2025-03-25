package com.keyin.golfclubapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.keyin.golfclubapi.model.Tournament;

/**
 * Repository interface for managing Tournament entities.
 * Provides built-in CRUD operations and custom search methods.
 */
public interface TournamentRepository extends JpaRepository<Tournament, Long> {
    List<Tournament> findByLocationContainingIgnoreCase(String location);
    List<Tournament> findByStartDate(String startDate); // If startDate is a String in your model
}
