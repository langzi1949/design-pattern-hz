package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * TODO
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/24 19:36
 **/
@Slf4j
public class SmartMethod extends StealingMethod{
    @Override
    protected String pickTarget() {
        return "一个穿着典雅的中年大妈";
    }

    @Override
    protected void confuseTarget(String target) {
        log.info(">>>>打算用美人计去迷惑：{}",target);
    }

    @Override
    protected void stealTheItem(String target) {
        log.info(">>>>迅雷不及掩耳抢了大妈的2毛钱，并快速撤离!!!");
    }
}
