package com.zmglove.dynamicproxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 用户服务的实现类
 *
 * @author CZH
 * @version 1.0
 * @date 2019/5/31 17:07
 **/
@Slf4j
public class UserServiceImpl implements IUserService{
    @Override
    public String getUserName() {
        log.info(".....获取用户的名称开始啦");
        return "Kobe";
    }
}
