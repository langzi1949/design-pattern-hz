package com.zmglove.general;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Car extends Conveyance{

    @Override
    public void move(){
        log.info("Car move......");
    }
}
