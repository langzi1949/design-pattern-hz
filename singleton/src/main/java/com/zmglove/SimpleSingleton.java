package com.zmglove;

/**
 * 简单的单例类(这种会出现线程不安全情况，在多线程情况下，容易产生多个实例)
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/16 19:34
 **/
public class SimpleSingleton {
    private static  SimpleSingleton INSTANCE;

    /**
     * 私有的构造器 不允许 进行直接的new对象
     */
    private SimpleSingleton(){}

    /**
     * 静态方法，提供给外部进行实例化
     * @return
     */
    public static SimpleSingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE =  new SimpleSingleton();
        }
        return INSTANCE;
    }
}
