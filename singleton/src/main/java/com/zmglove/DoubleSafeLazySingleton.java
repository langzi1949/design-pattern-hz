package com.zmglove;

/**
 * 双保险单例
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/17 14:10
 **/
public class DoubleSafeLazySingleton {

    private static DoubleSafeLazySingleton INSTANCE = new DoubleSafeLazySingleton();

    private DoubleSafeLazySingleton(){}

    public static DoubleSafeLazySingleton getInstance(){
        if(INSTANCE == null){
            synchronized(DoubleSafeLazySingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new DoubleSafeLazySingleton();
                }
            }

        }

        return INSTANCE;
    }
}
