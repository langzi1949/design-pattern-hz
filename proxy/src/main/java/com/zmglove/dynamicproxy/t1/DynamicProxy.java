package com.zmglove.dynamicproxy.t1;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理的接口
 *
 * @author CZH
 * @version 1.0
 * @date 2019/6/3 14:49
 **/
@Slf4j
public class DynamicProxy implements InvocationHandler {
    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log.info(">>>>> 代理方法已经生效，开始劫持方法啦......");
        // 1.1 start 只有这个方式才可以
        Method sourceMethod = target.getClass().getDeclaredMethod(method.getName(), method.getParameterTypes());
        sourceMethod.setAccessible(true);
        // 1.2 end

        // 2.1 直接强行的执行，是有问题的，会导致报错
        // method.invoke(target,args);

        return sourceMethod.invoke(target, args);
    }

    public static void main(String[] args) {
        // 创建代理类
        IRiskApplyService riskApplyService =
                (IRiskApplyService) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                        new Class[]{IRiskApplyService.class}, new DynamicProxy(new RiskApplyServiceImpl()));

        riskApplyService.submitApplyInfo();
        riskApplyService.checkApplyInfo();
        riskApplyService.getApplyResult();
    }
}
