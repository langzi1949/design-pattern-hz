package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 父亲类
 */
@Slf4j
public class Father extends Handler {
    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        log.info("----女儿向父亲请示-----");
        log.info(women.getRequest());
        log.info("---父亲的回答:同意----");
    }
}
