package com.baidu.unbiz.fluentvalidator.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baidu.unbiz.fluentvalidator.annotation.FluentValid;
import com.baidu.unbiz.fluentvalidator.dto.Car;
import com.baidu.unbiz.fluentvalidator.service.CarService;

/**
 * @author zhangxu
 */
@Service
public class CarServiceImpl implements CarService {

    @Override
    public Car addCar(@FluentValid Car car) {
        System.out.println("Come on! " + car);
        return car;
    }

    @Override
    public Car addCar(int x, @FluentValid Car car) {
        System.out.println("Come on! " + car);
        return car;
    }

    @Override
    public Car addCar(@FluentValid String x, Long y, @FluentValid Car car) {
        System.out.println("Come on! " + car);
        return car;
    }

    @Override
    public List<Car> addCars(String x, @FluentValid List<Car> cars) {
        System.out.println("Come on! " + cars);
        return cars;
    }

    @Override
    public Car[] addCars(@FluentValid Car[] cars, Double d) {
        System.out.println("Come on! " + cars);
        return cars;
    }
}