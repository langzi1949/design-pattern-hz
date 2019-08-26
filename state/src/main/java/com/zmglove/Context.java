package com.zmglove;

/**
 * 上下文类
 */
public class Context {
    /**
     * 静态常量的状态信息
     */
    public final static PayState payState = new PayState();
    public final static ShipState shipState = new ShipState();
    public final static CancelState cancelState = new CancelState();

    /**
     * 定义一个当前交易/购物的状态
     */
    private TradeState tradeState;

    public TradeState getTradeState(){
        return this.tradeState;
    }

    public void setTradeState(TradeState tradeState){
        this.tradeState = tradeState;
        // 把当前的环境通知到各个实现类中
        this.tradeState.setContext(this);
    }

    public void pay(){
        this.tradeState.pay();
    }

    public void ship(){
        this.tradeState.ship();
    }

    public void cancel(){
        this.tradeState.cancel();
    }

}
