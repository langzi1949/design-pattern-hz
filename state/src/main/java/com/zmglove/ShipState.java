package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 发货状态
 */
@Slf4j
public class ShipState extends TradeState{
    /**
     * 付款
     */
    @Override
    public void pay() {
        // 发货了，就不需要付款了
        // do nothing
    }

    /**
     * 发货
     */
    @Override
    public void ship() {
        log.info("卖家开始发货啦......");
    }

    /**
     * 取消交易(退货)
     */
    @Override
    public void cancel() {
        super.context.setTradeState(Context.cancelState);
        super.context.getTradeState().cancel();
    }
}
