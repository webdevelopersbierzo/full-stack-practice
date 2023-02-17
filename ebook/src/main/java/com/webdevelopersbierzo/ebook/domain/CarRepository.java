package com.webdevelopersbierzo.ebook.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long> {

    //Fetch cars by brand
    List<Car> findByBrand(@Param("brand")String brand);
    //Fetch cars by color
    List<Car> findByColor(@Param("color")String color);
    // Fetch cars by year
    List<Car> findByYear(@Param("year")Integer year);
    // Fetch cars by brand and model
//    List<Car> findByBrandAndModel(@Param("brand")@Param("model") String brand, String model);
//    //Fetch cars by brand and color
//    List<Car> findByBrandOrColor(@Param("brand", "model") String brand, String color);



}
