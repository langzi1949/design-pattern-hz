package com.zmglove;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductA2 implements ProductA{
    /**
     *
     */
    @Override
    public void getColor() {
        log.info("ProductA2 -> 颜色:{}","WHITE");
    }
}
