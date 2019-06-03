package com.zmglove.dynamicproxy;

import com.zmglove.cglibproxy.CglibProxyFactory;
import com.zmglove.cglibproxy.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * 测试类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/31 17:21
 **/
@Slf4j
public class UserServiceProxyTest {

    @Test
    public void test1() {

        UserServiceProxy proxy = new UserServiceProxy(new UserServiceImpl());

        IUserService userService = proxy.getUserServiceProxy();
        log.info(userService.getUserName());
    }

    @Test
    public void test2(){
        UserServiceProxyFactory factory = new UserServiceProxyFactory(new UserServiceImpl());

        IUserService userService = factory.getUserServiceProxy();
        log.info(userService.getUserName());
    }

    @Test
    public void testCglibProxy(){
        // 目标对象
        UserService userService = new UserService();
        // 代理对象
        UserService proxy = (UserService)new CglibProxyFactory(userService).getProxyInstance();

        // 执行代理对象方法
        proxy.sayHello();

    }
}
