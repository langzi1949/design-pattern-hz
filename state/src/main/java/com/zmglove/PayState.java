package com.zmglove;

import lombok.extern.slf4j.Slf4j;

/**
 * 付款状态
 */
@Slf4j
public class PayState  extends TradeState{
    /**
     * 付款
     */
    @Override
    public void pay() {
        log.info("开始付款动作..........");
    }

    /**
     * 发货
     */
    @Override
    public void ship() {
        super.context.setTradeState(Context.shipState);
        // 具体的动作需要委托为 ShipState 来执行
        super.context.getTradeState().ship();
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
