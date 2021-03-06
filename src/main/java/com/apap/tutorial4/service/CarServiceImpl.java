package com.apap.tutorial4.service;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import com.apap.tutorial4.model.CarModel;
import com.apap.tutorial4.model.DealerModel;
import com.apap.tutorial4.repository.CarDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * CarServiceImpl
 */
@Service
@Transactional
public class CarServiceImpl implements CarService {
	@Autowired
	private CarDb carDb;
 
@Override
public void addCar(CarModel car) {
	carDb.save(car);
	}
@Override
public Optional<CarModel> getCarDetailById(Long id){
	return carDb.findById(id);
	}

@Override
public void deleteCarById(Long carId) {
	carDb.delete(this.getCarDetailById(carId).get());
	}

@Override
public void updateCar(Long carId, CarModel newCar) {
	CarModel oldCar = this.getCarDetailById(carId).get();
	oldCar.setBrand(newCar.getBrand());
	oldCar.setType(newCar.getType());
	oldCar.setPrice(newCar.getPrice());
	oldCar.setAmount(newCar.getAmount());
	}
}