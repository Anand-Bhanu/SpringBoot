package com.example.auto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.auto.model.City;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {
    List<City> findByNameStartingWithIgnoreCase(String name);
}

