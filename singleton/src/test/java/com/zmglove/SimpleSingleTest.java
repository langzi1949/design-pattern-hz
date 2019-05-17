package com.zmglove;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.function.Supplier;

/**
 * langzi
 *
 * @author CZH
 * @version 1.0
 * @date 2019/4/24 18:26
 **/
@Slf4j
public class SimpleSingleTest extends SingletonTest<SimpleSingleton>{

    public SimpleSingleTest() {
        super(SimpleSingleton::getInstance);
    }

    @Test
    @Override
    public void testMultiCallReturnSameObjectInSameThread(){
        super.testMultiCallReturnSameObjectInSameThread();
    }

    @Test
    @Override
    public void testMultiCallReturnSameObjectInDiffThread(){
        super.testMultiCallReturnSameObjectInDiffThread();
    }
}
