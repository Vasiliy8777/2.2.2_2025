package service;

import dao.CarDao;
import models.Car;

import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private final CarDao cardao;

    public CarServiceImp(CarDao cardao) {
        this.cardao = cardao;
    }

    @Override
    public List<Car> listCars(Integer count) {
        return cardao.listCars(count);
    }
}
