package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 取消状态
 */
@Slf4j
public class CancelState extends TradeState{
    /**
     * 付款
     */
    @Override
    public void pay() {
        // 取消了，何来的付款
        // do nothing
    }

    /**
     * 发货
     */
    @Override
    public void ship() {
        // 取消了，何来的发货
        // do nothing
    }

    /**
     * 取消交易(退货)
     */
    @Override
    public void cancel() {
        log.info("买家强烈要求取消交易......");
    }
}
