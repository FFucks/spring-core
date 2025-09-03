package com.ffucks.components;

import com.ffucks.components.interfaces.Engine;
import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricEngine implements Engine {

    @Override
    public String type() {
        return "Electric";
    }

    @Override
    public String start() {
        return "Electric engine started!";
    }

    @Override
    public int autonomy() {
        return 300;
    }

    @Override
    public int horsePower() {
        return 300;
    }
}
