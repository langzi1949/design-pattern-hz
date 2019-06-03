package com.zmglove.cglibproxy;


import lombok.extern.slf4j.Slf4j;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 进行Cglib方式的代理
 *
 * @author CZH
 * @version 1.0
 * @date 2019/6/3 11:25
 **/
@Slf4j
public class CglibProxyFactory implements MethodInterceptor {
    //代理目标对象
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        log.info(">>>>> 开始事务......");
        // 执行目标对象的方法
        Object value = method.invoke(target, args);
        log.info(">>>>> 结束事务......");
        return value;
    }

    /**
     * 返回代理对象
     *
     * @return
     */
    public Object getProxyInstance() {
        // 1. 工具类
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类
        enhancer.setSuperclass(target.getClass());
        // 3. 设置回调方法
        enhancer.setCallback(this);
        // 4. 创建子类(代理对象)
        return enhancer.create();
    }
}
