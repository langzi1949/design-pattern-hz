package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 开发组
 */
@Slf4j
public class DevGroup extends Group {
    @Override
    public void find() {
        log.info("找到开发组.......");
    }

    @Override
    public void doSomething() {
        log.info("开发组开始为所欲为.......");
    }
}
