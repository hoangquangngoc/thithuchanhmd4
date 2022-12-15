package com.example.thithuchanhmodul4.Repository;

import com.example.thithuchanhmodul4.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountry  extends JpaRepository<Country, Long> {
}
