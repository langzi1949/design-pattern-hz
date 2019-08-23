package com.zmglove;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreteStrategy1 implements Strategy {
    /**
     * 策略模式的方法
     */
    @Override
    public void doSomething() {
        log.info(">>>>具体的策略1的方法执行体");
    }
}
