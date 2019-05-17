package com.zmglove.general;

import lombok.extern.slf4j.Slf4j;

/**
 * 产品基类
 */
@Slf4j
public abstract  class Conveyance {

    public void move(){
        log.info("move......");
    }
}
