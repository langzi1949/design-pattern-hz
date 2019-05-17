package com.zmglove;

import com.zmglove.advanced.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

@Slf4j
public class AdvancedFactoryTest {

    @Test
    public void test(){
        AdvancedFactory factory = new ConcretFactory();
        Product productA = factory.create(ProductA.class);
        log.info(">>>>>{}",productA.color());

        Product productB = factory.create(ProductB.class);
        log.info(">>>>>{}",productB.color());
    }
}
