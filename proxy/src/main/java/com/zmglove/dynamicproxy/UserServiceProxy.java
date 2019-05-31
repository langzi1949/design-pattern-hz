package com.zmglove.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 用户服务的代理类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/31 17:16
 **/
public class UserServiceProxy implements InvocationHandler {
    private IUserService userService;

    public UserServiceProxy(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (IUserService.class.isAssignableFrom(proxy.getClass()) && "getUserName".equals(method.getName())) {
            // 串改一下信息
            return "james";
        }
        return method.invoke(userService,args);
    }

    public IUserService getUserServiceProxy() {
        return (IUserService) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{IUserService.class},
                this);
        // 另外一种方式为
//        return (IUserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
//                userService.getClass().getInterfaces(), this);
    }
}
