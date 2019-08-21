package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 儿子类
 */
@Slf4j
public class Son extends Handler {
    public Son() {
        super(Handler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        log.info("----母亲向儿子请示-----");
        log.info(women.getRequest());
        log.info("---儿子的回答:同意----");
    }
}
