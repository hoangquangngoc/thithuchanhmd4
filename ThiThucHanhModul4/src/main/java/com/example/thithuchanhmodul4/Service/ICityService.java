package com.example.thithuchanhmodul4.Service;

import com.example.thithuchanhmodul4.model.City;

import java.util.List;

public interface ICityService {

    List<City> findAll();

    City findById(Long id);

    void deleteById(Long id);

    City save(City city);
}
