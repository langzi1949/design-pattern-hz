package com.zmglove;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * 测试类
 */
@Slf4j
public class PrototypeTest {

    @Test
    public void test(){
        Prototype p1 = new Prototype();
        log.info(">>>{}",p1.toString());

        p1.change();

        log.info(".....{}",p1.toString());

        Prototype p2 = p1.clone();

        log.info("####{}",p2.toString());
    }
}
