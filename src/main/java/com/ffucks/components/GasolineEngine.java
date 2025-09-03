package com.ffucks.components;

import org.springframework.stereotype.Component;

@Component("gasoline")
public class GasolineEngine implements com.ffucks.components.interfaces.Engine {

    @Override
    public String type() {
        return "Gasoline";
    }

    @Override
    public String start() {
        return "Gasoline engine started!";
    }

    @Override
    public int autonomy() {
        return 600;
    }

    @Override
    public int horsePower() {
        return 150;
    }
}
