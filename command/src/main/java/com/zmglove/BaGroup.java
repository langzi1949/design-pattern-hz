package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 需求组
 */
@Slf4j
public class BaGroup extends Group {
    @Override
    public void find() {
        log.info("找到了需求组.......");
    }

    @Override
    public void doSomething() {
        log.info("需求组开始干活啦.....");
    }
}
