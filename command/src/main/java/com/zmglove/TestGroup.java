package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 测试组
 */
@Slf4j
public class TestGroup extends Group{
    @Override
    public void find() {
        log.info("找到测试组......");
    }

    @Override
    public void doSomething() {
        log.info("测试组开始抓开发组小辫子啦.....");
    }
}
