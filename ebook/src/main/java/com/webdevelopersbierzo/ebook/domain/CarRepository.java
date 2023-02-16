package com.webdevelopersbierzo.ebook.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {

    //Fetch cars by brand
    List<Car> findByBrand(String brand);
    //Fetch cars by color
    List<Car> findByColor(String color);
    // Fetch cars by year
    List<Car> findByYear(Integer year);
    // Fetch cars by brand and model
    List<Car> findByBrandAndModel(String brand, String model);
    //Fetch cars by brand and color
    List<Car> findByBrandOrColor(String brand, String color);



}
