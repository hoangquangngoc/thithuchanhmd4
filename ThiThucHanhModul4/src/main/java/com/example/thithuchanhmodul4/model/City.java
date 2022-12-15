package com.example.thithuchanhmodul4.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;

@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCity;

    private String name;
    @ManyToOne
    @JoinColumn(name = "idCountry")
    private Country country;

    @NotNull
    @DecimalMin(value = "20.0", message = "Diện tích nhỏ nhất là 50!")
    private double area;

    @NotNull
    @DecimalMin(value = "20.0", message = "Dân số nhỏ nhất là 50!")
    private double population;

    @NotNull
    @DecimalMin(value = "20.0", message = "GDP nhỏ nhất là 50!")
    private double gdp;


    private String description;

    public City() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getIdCity() {
        return idCity;
    }

    public void setIdCity(Long idCity) {
        this.idCity = idCity;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


