package com.zmglove;

/**
 *
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/17 14:32
 **/
public class InnerSingletonTest extends SingletonTest<InnerSingleton>{

    public InnerSingletonTest(){
        super(InnerSingleton::getInstance);
    }
}
