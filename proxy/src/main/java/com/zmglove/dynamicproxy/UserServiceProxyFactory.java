package com.zmglove.dynamicproxy;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 用户服务代理工厂
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/31 18:00
 **/
@Slf4j
public class UserServiceProxyFactory {
    /**
     * 目标对象
     */
    private IUserService userService;

    public UserServiceProxyFactory(IUserService userService) {
        this.userService = userService;
    }

    public IUserService getUserServiceProxy() {
        return (IUserService) Proxy.newProxyInstance(
                userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        log.info("动态代理开始干活啦.......");
                        Object result = null;
                        if (IUserService.class.isAssignableFrom(proxy.getClass()) && "getUserName".equals(method.getName())) {
                            // 串改一下信息
                            result = "Steven Curry";
                        }
                        log.info("动态代理结束干活啦.......");
                        return result;
                    }
                }
        );
    }
}
