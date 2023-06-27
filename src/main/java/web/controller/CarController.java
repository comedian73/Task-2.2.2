package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {
        List<String> cars = new ArrayList<>();
        cars.add("Hello!");
        cars.add("I'm Spring MVC application");
        cars.add("5.2.0 version by sep'19 ");
        model.addAttribute("cars", cars);
        return "cars";
    }
}
