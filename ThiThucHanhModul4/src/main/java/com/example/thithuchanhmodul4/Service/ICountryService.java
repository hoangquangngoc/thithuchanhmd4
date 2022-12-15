package com.example.thithuchanhmodul4.Service;

import com.example.thithuchanhmodul4.model.Country;

import java.util.List;

public interface ICountryService {
    List<Country> findAll();

    Country findById(Long id);

    void deleteById(Long id);

    Country save(Country city);
}
