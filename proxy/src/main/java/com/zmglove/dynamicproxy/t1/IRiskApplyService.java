package com.zmglove.dynamicproxy.t1;

/**
 * 风控的接口
 *
 * @author CZH
 * @version 1.0
 * @date 2019/6/3 14:39
 **/
public interface IRiskApplyService {

    void submitApplyInfo();

    void checkApplyInfo();

    void getApplyResult();
}
