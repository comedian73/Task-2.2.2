package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String cars(
            @RequestParam(value = "count", defaultValue = "5")
            int allCars, Model model) {
        CarService carService = new CarServiceImp();
        List<Car> list = new ArrayList<>();
        list.add(new Car("Ford", "Mustang", 20000));
        list.add(new Car("KIA", "Sportage", 13000));
        list.add(new Car("Lamborghini", "350GT", 50000));
        list.add(new Car("Renault", "LOGAN", 5000));
        list.add(new Car("VAZ Lada", "2106", 3000));
        list = carService.carsCount(list, allCars);
        model.addAttribute("list", list);

        return "cars";
    }
}
