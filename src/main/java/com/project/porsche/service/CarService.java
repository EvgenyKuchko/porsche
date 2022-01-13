package com.project.porsche.service;

import com.project.porsche.dto.CarDto;
import com.project.porsche.repository.CarRepository;
import com.project.porsche.transformers.CarTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CarTransformer carTransformer;

    @Transactional
    public CarDto getCarByModel(String model) {
        return carTransformer.transform(carRepository.findByModel(model));
    }
}