package com.zmg;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FourGradeReport extends Report{
    @Override
    public void report() {
        log.info("尊敬的家长:" +
                "\n");
        log.info("语文 78");
        log.info("............\n");
        log.info("    家长签名:      ");

    }

    @Override
    public void sign() {
        log.info(">>>>>签名成功");
    }
}
