package com.zmglove;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductA1 implements ProductA{
    /**
     *
     */
    @Override
    public void getColor() {
        log.info("ProductA1 -> 颜色:{}","WHITE");
    }
}
