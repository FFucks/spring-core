package com.ffucks.services;

import com.ffucks.components.interfaces.Engine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CarService {

    private final Map<String, Engine> engines;
    private final String defaultCar;

    public CarService(Map<String, Engine> engines, @Value("${car.engine:gasoline}") String defaultCar) {
        this.engines = engines;
        this.defaultCar = defaultCar;
    }

    public String drive() {
        return driveWithType(defaultCar);
    }

    public String driveWithType(String type) {
        Engine engine = engines.get(type);

        if (engine == null) {
            throw new IllegalArgumentException("Invalid engige type: " + type + ". Options: " + engines.keySet());
        }

        return engine.start() + " Type: " + engine.type() +
                " | Autonomy: " + engine.autonomy() + " km";
    }

}
