package com.zmglove;

/**
 * 线程安全的接口
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/17 14:04
 **/
public class ThreadSafeLazyLoadSingleton {
    private static ThreadSafeLazyLoadSingleton INSTANCE;

    private ThreadSafeLazyLoadSingleton(){
        if(INSTANCE == null){
            INSTANCE = this;
        }else{
            throw new IllegalStateException("实例已经实例化");
        }
    }

    public static synchronized ThreadSafeLazyLoadSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ThreadSafeLazyLoadSingleton();
        }
        return INSTANCE;
    }
}
