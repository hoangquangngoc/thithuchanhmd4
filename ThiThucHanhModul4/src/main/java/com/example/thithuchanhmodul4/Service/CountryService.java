package com.example.thithuchanhmodul4.Service;

import com.example.thithuchanhmodul4.Repository.ICountry;
import com.example.thithuchanhmodul4.Service.ICountryService;
import com.example.thithuchanhmodul4.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements ICountryService {

    @Autowired
    private ICountry countryRepo;

    @Override
    public List<Country> findAll() {
        return countryRepo.findAll();
    }

    @Override
    public Country findById(Long id) {
        if (countryRepo.findById(id).isPresent()){
            return countryRepo.findById(id).get();
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        countryRepo.deleteById(id);
    }

    @Override
    public Country save(Country city) {
        return countryRepo.save(city);
    }
}