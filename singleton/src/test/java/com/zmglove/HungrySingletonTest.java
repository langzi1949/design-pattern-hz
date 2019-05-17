package com.zmglove;

/**
 * 饿汉式单例测试
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/17 13:53
 **/
public class HungrySingletonTest extends SingletonTest<HungrySingleton>{


    public HungrySingletonTest() {
        super(HungrySingleton::getInstance);
    }

}
