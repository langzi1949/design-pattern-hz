package com.zmglove.dynamicproxy.t1;

import lombok.extern.slf4j.Slf4j;

/**
 * 这个方法和IRiskApplyService接口中的方法是一致的
 * 但是不采取implements的方式
 *
 * @author CZH
 * @version 1.0
 * @date 2019/6/3 14:46
 **/
@Slf4j
public class RiskApplyServiceImpl {
    public void submitApplyInfo() {
        log.info(">>>>> 提交风控申请资料......");
    }

    public void checkApplyInfo() {
        log.info(">>>>> 校验风控申请资料......");
    }

    public void getApplyResult() {
        log.info(">>>>> 获取风控申请结果......");
    }
}
