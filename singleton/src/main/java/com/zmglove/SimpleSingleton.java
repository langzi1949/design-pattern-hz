package com.zmglove;

/**
 * 简单的单例类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/16 19:34
 **/
public class SimpleSingleton {
    private static final SimpleSingleton INSTANCE = new SimpleSingleton();

    /**
     * 私有的构造器 不允许 进行直接的new对象
     */
    private SimpleSingleton(){}

    public static SimpleSingleton getInstance(){
        return INSTANCE;
    }
}
