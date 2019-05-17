package com.zmglove;

/**
 * 线程安全的实例测试类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/17 14:07
 **/
public class ThreadSafeLazyTest extends SingletonTest<ThreadSafeLazyLoadSingleton>{

    public ThreadSafeLazyTest(){
        super(ThreadSafeLazyLoadSingleton::getInstance);
    }
}
