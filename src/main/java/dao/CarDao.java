package dao;

import models.Car;

import java.util.List;

public interface CarDao {
    List<Car> listCars(Integer count);
}
