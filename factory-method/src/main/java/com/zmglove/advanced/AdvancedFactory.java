package com.zmglove.advanced;

public interface AdvancedFactory {

    /**
     * 通过一种反射的方式进行实例的创建
     * @param clazz
     * @param <T>
     * @return
     */
    <T extends Product> T create(Class<T> clazz);
}
