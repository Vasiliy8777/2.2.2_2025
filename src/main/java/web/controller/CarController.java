package web.controller;

import models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Corolla", "Toyota", 200000));
        cars.add(new Car("Carina", "Toyota", 250000));
        cars.add(new Car("Celica", "Toyota", 550000));
        cars.add(new Car("X5", "BMW", 150000));
        cars.add(new Car("X7", "BMW", 50000));
        if (count == null || count <= 0) {
            count = cars.size();
        }
        model.addAttribute("car", cars.size() > count ? cars.subList(0, count) : cars);
        return "cars";
    }

}
