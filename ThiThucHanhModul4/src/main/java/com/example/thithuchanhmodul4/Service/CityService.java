package com.example.thithuchanhmodul4.Service;

import com.example.thithuchanhmodul4.Repository.ICityRepo;
import com.example.thithuchanhmodul4.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {
    @Autowired
    private ICityRepo cityRepo;

    @Override
    public List<City> findAll() {
        return cityRepo.findAll();
    }

    @Override
    public City findById(Long id) {
        if (cityRepo.findById(id).isPresent()) {
            return cityRepo.findById(id).get();
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        cityRepo.deleteById(id);
    }

    @Override
    public City save(City city) {
        return cityRepo.save(city);
    }
}
