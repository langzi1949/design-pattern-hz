package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 丈夫类
 */
@Slf4j
public class Husband extends Handler {
    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        log.info("----妻子向丈夫请示-----");
        log.info(women.getRequest());
        log.info("---丈夫的回答:同意----");
    }
}
