package com.zmglove.general;

public class CarFactory extends Factory{
    @Override
    public Conveyance create(){
        return new Car();
    }
}
