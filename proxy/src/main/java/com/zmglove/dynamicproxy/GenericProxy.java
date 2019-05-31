package com.zmglove.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 泛型的方式
 */
public class GenericProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){

        return (T) Proxy.newProxyInstance(loader,interfaces,handler);

    }
}
