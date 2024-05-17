package com.example.auto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.auto.model.City;
import com.example.auto.service.CityService;

import java.util.List;

@RestController
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/suggestions")
    public List<City> getSuggestions(@RequestParam String q,
                                     @RequestParam(required = false) Double latitude,
                                     @RequestParam(required = false) Double longitude) {
        return cityService.findSuggestions(q, latitude, longitude);
    }
}
