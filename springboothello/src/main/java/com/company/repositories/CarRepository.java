package com.company.repositories;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.compay.model.Car;
 
 
@Repository
public interface CarRepository extends MongoRepository < Car, String > {
    @Query("{ 'model' : ?0 }")
    Car findByModel(String model);
 
    @Query(value = "{ 'brand' : ?0}")
    List < Car > findByBrand(String brand);
    
    @Query(value="{'brand': ?0}")
    Page<Car> findByMethod(String name, Pageable pageable);
}