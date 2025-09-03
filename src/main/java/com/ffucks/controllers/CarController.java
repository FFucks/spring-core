package com.ffucks.controllers;

import com.ffucks.services.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/drive")
    public String defaultDrive() {
        return carService.drive();
    }

    @GetMapping(value = "/drive", params = "type")
    public String driveWithEngine(@RequestParam String type) {
        return carService.driveWithType(type);
    }
}
