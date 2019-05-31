package com.zmglove.staticproxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 球类的代理类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/31 14:14
 **/
@Slf4j
public class BallProxy implements Ball {

    private Ball ball;

    public BallProxy(Ball ball) {
        this.ball = ball;
    }

    @Override
    public void setColor(String color) {
        this.ball.setColor(color);
    }

    @Override
    public void play() {
        log.info("Hahahahahah........");
    }
}
