package com.zmglove;

/**
 * 枚举单例测试类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/17 14:01
 **/
public class EnumSingletonTest extends SingletonTest<EnumSingleton>{

    public EnumSingletonTest(){
        super(() -> EnumSingleton.INSTANCE);
    }
}
