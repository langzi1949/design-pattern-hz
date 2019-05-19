package com.zmglove;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ProductB2 implements  ProductB{
    @Override
    public void getColor() {
        log.info("ProductB2 -> 颜色:{}","BLUE");
    }
}
