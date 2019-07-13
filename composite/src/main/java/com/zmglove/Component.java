package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 抽象构件
 */
@Slf4j
public abstract  class Component {

    /**
     * 个体和整体都具有的共性
     */
    public void doSomething(){
       log.info(">>>>大家都有名字/基本信息");
    }
}
