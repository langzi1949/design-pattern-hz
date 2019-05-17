package com.zmglove;

/**
 * 一个线程安全的单例模式，一般也会被称为  饿汉式
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/17 13:48
 **/
public class HungrySingleton {

    private static HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton(){}

    /**
     * 返回实例
     * @return
     */
    public static HungrySingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new HungrySingleton();
        }
        return INSTANCE;
    }
}
