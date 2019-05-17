package com.zmglove;

/**
 * 通过内部类方式进行单例
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/17 14:24
 **/
public class InnerSingleton {

    private InnerSingleton(){}

    public static InnerSingleton getInstance(){
        return HelperHolder.INSTANCE;
    }

    /**
     * 一个懒加载的方式
     */
    private static class HelperHolder{
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }
}
