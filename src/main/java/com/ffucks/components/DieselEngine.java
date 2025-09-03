package com.ffucks.components;

import com.ffucks.components.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements Engine {

    @Override
    public String type() {
        return "Diesel";
    }

    @Override
    public String start() {
        return "Diesel engine started!";
    }

    @Override
    public int autonomy() {
        return 1000;
    }

    @Override
    public int horsePower() {
        return 200;
    }
}
