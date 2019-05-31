package com.zmglove.staticproxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 产品类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/31 14:11
 **/
@Slf4j
public class Football implements Ball {

    private String color;


    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public void play() {
        log.info("I will Play Football!!!!");
    }
}
