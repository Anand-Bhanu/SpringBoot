package com.example.auto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.auto.model.City;
import com.example.auto.repository.CityRepository;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public List<City> findSuggestions(String searchTerm, Double latitude, Double longitude) {
        List<City> suggestions;

        if (latitude != null && longitude != null) {
            suggestions = cityRepository.findByNameStartingWithIgnoreCase(searchTerm);
            suggestions.sort((c1, c2) -> {
                double distance1 = calculateDistance(latitude, longitude, c1.getLatitude(), c1.getLongitude());
                double distance2 = calculateDistance(latitude, longitude, c2.getLatitude(), c2.getLongitude());
                return Double.compare(distance1, distance2);
            });
        } else {
            suggestions = cityRepository.findByNameStartingWithIgnoreCase(searchTerm);
        }

        return suggestions;
    }

    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        // Implement distance calculation logic (e.g., Haversine formula)
        return 0.0; // Placeholder
    }
}

