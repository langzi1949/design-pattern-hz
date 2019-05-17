package com.zmglove.general;

public class TruckFactory extends Factory{

    @Override
    public Conveyance create(){
        return new Trunck();
    }
}
