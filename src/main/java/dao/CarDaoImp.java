package dao;

import models.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {

    @Override
    public List<Car> listCars(Integer count) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Corolla", "Toyota", 200000));
        cars.add(new Car("Carina", "Toyota", 250000));
        cars.add(new Car("Celica", "Toyota", 550000));
        cars.add(new Car("X5", "BMW", 150000));
        cars.add(new Car("X7", "BMW", 50000));
        if (count == null || count <= 0) {
            count = cars.size();
        }
        return cars.size() > count ? cars.subList(0, count) : cars;
    }
}
