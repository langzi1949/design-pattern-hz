package com.zmglove;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductB1 implements ProductB{

    @Override
    public void getColor() {
        log.info("ProductB1 -> 颜色:{}","BLUE");
    }
}
