package com.apap.tutorial4.service;

import java.util.List;
import java.util.Optional;
import com.apap.tutorial4.model.CarModel;

/**
 * CarService
 */

public interface CarService {
	void addCar(CarModel car);
	
	Optional<CarModel> getCarDetailById(Long id);
	
	void deleteCarById(Long carId);
	void updateCar(Long carId, CarModel newCar);
}